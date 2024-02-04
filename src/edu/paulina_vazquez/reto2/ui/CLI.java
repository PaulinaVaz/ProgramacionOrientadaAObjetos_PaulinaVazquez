package edu.paulina_vazquez.reto2.ui;

import java.util.Scanner;

import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.comprarCajas;
import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.finalizarPrograma;
import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.mostrarReporte;
import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.venderCajas;

public class CLI {
    /**
     * Se encarga de mostrar un menu al usuario para que
     * se elija la opcion deseada, este dirige al
     * programa al proceso indico y regresa al menu en
     * caso de que el usuario no finalice el programa.
     */
    public static void showMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la letra de la opción deseada");
        System.out.println("A. Comprar cajas de papel.");
        System.out.println("B. Vender cajas de papel.");
        System.out.println("C. Mostrar reporte");
        System.out.println("D. Salir del programa");
        while (true){
            String opcion = scanner.nextLine();
            int totalDeOperaciones = 0;

            switch (opcion.toUpperCase()) {
                case "A":
                    comprarCajas();
                    totalDeOperaciones++;
                    break;
                case "B":
                    venderCajas();
                    totalDeOperaciones++;
                    break;
                case "C":
                    mostrarReporte();
                    break;
                case "D":
                    scanner.close();
                    finalizarPrograma();
                    System.out.println("El total de operaciones es: " + totalDeOperaciones);
                    return;
                default:
                    System.out.println("Opcion no valida, por favor intente denuevo");
            }
        }
    }
}
