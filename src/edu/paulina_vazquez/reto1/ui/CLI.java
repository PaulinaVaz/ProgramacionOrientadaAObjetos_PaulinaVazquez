package edu.paulina_vazquez.reto1.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){

        System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");

        System.out.println("Ingrese la letra de la opción deseada");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

    }
    private static void Switch(String opcion) {
            case "A"
                CalculadoraMasaCorporal();
                break;
            case "B"
                CalculadoraMasaMagra();
                break;
            case "C"

                break;
            default
                System.out.println("Opcion no valida");

        }
}
