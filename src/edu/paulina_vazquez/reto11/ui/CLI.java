package edu.paulina_vazquez.reto11.ui;

import edu.paulina_vazquez.reto11.process.WordManager;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CLI {
    /**
     * Esta clase se encarga de la interfaz que usa el programa
     * para que el usuario interactue con el.
     */
    public static void showMenu (){

        /**
         * Se imprime en pantalla las opciones de idioma para que
         * el usuario elija la deseada.
         */

        edu.paulina_vazquez.reto11.ui.Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionIdioma = scanner.nextInt();
        scanner.nextLine();

        String idioma = null;
        switch (opcionIdioma) {
            case 1:
                idioma = "Español";
                break;
            case 2:
                idioma = "English";
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        /**
         * Se imprime el menu en el idioma seleccionado por el usuario
         * y se muestran las opciones de libros.
         */

        edu.paulina_vazquez.reto11.ui.Textos textos = Textos.crearTextos(idioma);
        System.out.println(textos.bienvenida());
        System.out.println(textos.menu());

        List<String> libros = Arrays.asList(
                "Caperucita Roja",
                "El cachorro del cazador",
                "El gato y los ratones",
                "El leon y la espina",
                "THE GINGERBREAD MAN"
        );

        /**
         * Se direcciona el proceso y se imprime el resultado en pantalla,
         * de haber un error lo notifica al usuario.
         */

        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }

        int opcionLibro = scanner.nextInt();

        if (opcionLibro < 1 || opcionLibro > libros.size()) {
            System.out.println(textos.opcion_invalida());
            return;
        }

        /**
         * Se encarga de imprimir en pantalla todos los textos para
         * mostrar el resultado final al usuario dependiendo del
         * libro elegido.
         */

        String libroSeleccionado = libros.get(opcionLibro - 1);
        System.out.println(textos.palabras_repetidas() + "\"" + libroSeleccionado + "\":");
        try {
            WordManager wordManager = new WordManager();
            wordManager.contarPalabras(libroSeleccionado + ".txt");
            wordManager.imprimirPalabrasMasRepetidas(textos);
            System.out.println(textos.total_vocales() + wordManager.contarVocalesTotales());


            List<String> palabrasConVocalInicial = wordManager.obtenerPalabrasConVocalInicial();
            if (!palabrasConVocalInicial.isEmpty()) {
                System.out.println(textos.palabras_vocales());
                palabrasConVocalInicial.forEach(System.out::println);
            } else {
                System.out.println("No hay palabras que comiencen con vocal en este libro.");
            }

            System.out.println(textos.longitud_impar());
            wordManager.obtenerPalabrasConLongitudImpar().forEach(System.out::println);
            System.out.println(textos.palabras_mas_larga() + wordManager.encontrarPalabraMasLarga());
            System.out.println(textos.palabras_mas_corta() + wordManager.encontrarPalabraMasCorta());
            System.out.println(textos.palabra_caso_especial() +
                    (wordManager.verificarExistenciaPalabraConVocalInicialFinalYLargo() ? "Sí" : "No"));
        } catch (IOException e) {
            System.out.println(textos.error_lectura());
        }

    }
}
