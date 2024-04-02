package edu.paulina_vazquez.evidencia2.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        Textos.escogerIdioma();
        Scanner scanner = new Scanner(System.in);
        int opcionDeIdioma = scanner.nextInt();

        switch (opcionDeIdioma) {
            case 1:
                edu.paulina_vazquez.evidencia2.ui.Textos.setEsp();
                break;
            case 2:
                edu.paulina_vazquez.evidencia2.ui.Textos.setIng();
                break;
            default:
                System.out.println("Opcion no valida, por favor intentelo de nuevo.");
                System.out.println("Invalid option, please try again.");
                return;
        }
    }
}
