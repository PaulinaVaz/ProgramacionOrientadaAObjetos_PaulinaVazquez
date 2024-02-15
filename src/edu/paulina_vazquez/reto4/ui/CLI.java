package edu.paulina_vazquez.reto4.ui;

import edu.paulina_vazquez.reto4.process.VentasDeBoleto;

import java.util.Scanner;

public class CLI {
    public static void showMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa, seleccione la opcion deseada.");
        System.out.println("A. Realizar venta de boleto");
        System.out.println("B. Mostrar datos de la lista de ventas");
        String opcion = scanner.nextLine();

        while (true){
            switch (opcion){
                case "A":
                    VentasDeBoleto.venderBoleto();
                    break;
                case "B":
                    VentasDeBoleto.listarVentas();
                    break;
                case "C":
                    System.out.println("Programa finalizado");
                    return;
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
            }
            scanner.close();
        }
    }
}
