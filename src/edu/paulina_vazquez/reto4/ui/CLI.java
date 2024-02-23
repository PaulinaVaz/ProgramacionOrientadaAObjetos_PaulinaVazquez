package edu.paulina_vazquez.reto4.ui;

import edu.paulina_vazquez.reto4.process.VentasDeBoleto;
import java.util.Scanner;

public class CLI {
    public static void showMenu (VentasDeBoleto ventasDeBoleto){
        /**
         * Muestra un menu para que el usuario interactue con el
         * programa, segun la opcion que este desee. Esta
         * interaccion finaliza cuando el usuario lo indica.
         */
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Bienvenido al programa, seleccione la opcion deseada.");
            System.out.println("A. Realizar venta de boleto");
            System.out.println("B. Mostrar datos de la lista de ventas");
            System.out.println("C. Finalizacion del programa");
            String opcion = scanner.nextLine();

            switch (opcion.toUpperCase()){
                case "A":
                    ventasDeBoleto.venderBoleto();
                    break;
                case "B":
                    ventasDeBoleto.mostrarVentas();
                    break;
                case "C":
                    scanner.close();
                    System.out.println("Programa finalizado");
                    return;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
        }
    }
}
