package edu.paulina_vazquez.reto2.ui;

import java.util.Scanner;

import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.comprarCajas;
import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.finalizarPrograma;
import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.mostrarReporte;
import static edu.paulina_vazquez.reto2.process.CalculadoraDeCajas.venderCajas;

public class CLI {
    public static void showMenu(int totalDeOperaciones) {

        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("Ingrese la letra de la opción deseada");
            System.out.println("a. Comprar cajas de papel.");
            System.out.println("b. Vender cajas de papel.");
            System.out.println("c. Mostrar reporte");
            System.out.println("d. Salir del programa");
            opcion = scanner.nextLine();


            switch (opcion.toUpperCase()) {
                case "a":
                    comprarCajas();
                    totalDeOperaciones++;
                    break;
                case "b":
                    venderCajas();
                    totalDeOperaciones++;
                    break;
                case "c":
                    mostrarReporte();
                    break;
                case "d":
                    finalizarPrograma();
                default:
                    System.out.println("Opcion no valida, por favor intente denuevo");
                }
        } while (!(opcion.equals("z")));
    }
}
