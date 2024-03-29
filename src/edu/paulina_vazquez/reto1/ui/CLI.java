package edu.paulina_vazquez.reto1.ui;

import java.util.Scanner;

import static edu.paulina_vazquez.reto1.process.CalculadoraMasaCorporal.calcularIndiceMasaCorporal;
import static edu.paulina_vazquez.reto1.process.CalculadoraMasaMagra.calcularMasaMagra;
import static edu.paulina_vazquez.reto1.process.CalculadoraMetabolismoBasal.calcularMetabolismoBasal;

public class CLI {

    /**
     * La funcion de esta clase es presentar una menu
     * al usuario en el que pueda elegir la opcion que
     * necesite, si el dato ingresado no es valido se
     * le mostrara un mensaje que lo indique.
     */
    public static void showMenu() {

        System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");

        System.out.println("Ingrese la letra de la opción deseada");

        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();

        switch (opcion.toUpperCase()){
            case "A":
                calcularIndiceMasaCorporal();
                break;
            case "B":
                calcularMasaMagra();
                break;
            case "C":
                calcularMetabolismoBasal();
                break;
            default:
                System.out.println("Opcion no valida, por favor vuelva a intertarlo.");
        }
    }

}