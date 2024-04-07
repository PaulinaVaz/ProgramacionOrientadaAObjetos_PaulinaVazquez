package edu.paulina_vazquez.reto9.ui;

import edu.paulina_vazquez.reto9.process.WordManager;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CLI {
    public static void showMenu (){
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
        Textos textos = Textos.crearTextos(idioma);
        System.out.println(textos.bienvenida());
        System.out.println(textos.menu());

        List<String> libros = Arrays.asList(
                "THE GINGERBREAD MAN",
                "El leon y la espina",
                "El gato y los ratones",
                "El cachorro del cazador",
                "Caperucita Roja"
        );
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
