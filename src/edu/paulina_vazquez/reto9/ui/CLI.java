package edu.paulina_vazquez.reto9.ui;

import edu.paulina_vazquez.reto9.process.WordManager;

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

        Textos.escogerIdioma();
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

        Textos textos = Textos.crearTextos(idioma);
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
        scanner.nextLine();

        if (opcionLibro < 1 || opcionLibro > libros.size()) {
            System.out.println(textos.opcion_invalida());
            return;
        }
        String libroSeleccionado = libros.get(opcionLibro - 1);
        System.out.println(textos.palabras_repetidas() + libroSeleccionado + "\":");
        try {
            WordManager wordManager = new WordManager();
            wordManager.contarPalabras(libroSeleccionado + ".txt");
            wordManager.imprimirPalabrasMasRepetidas(textos);
        } catch (IOException e) {
            System.out.println(textos.error_lectura());
        }

    }
}
