package edu.paulina_vazquez.reto9.ui;

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
                idioma = "español";
                break;
            case 2:
                idioma = "english";
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }
        Textos textos = Textos.crearTextos(idioma);
        System.out.println(textos.bienvenida());
        System.out.println(textos.menu());
    }
}
