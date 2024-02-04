package edu.paulina_vazquez.reto2.process;

import java.util.Scanner;

public class CalculadoraDeCajas {
    public static void mostrarReporte() {

        int totalDeOperaciones = 0;
        double totalDeIngresos = 0;
        double totalDeEgresos = 0;
        int totalDeCompras = 0;
        int totalDeVentas = 0;
        double montoDeCaja = 0;

        System.out.println("La cantidad total de operaciones realizadas es " +
                totalDeOperaciones + ".");
        System.out.println("La cantidad total de compras es realizadas es " +
                totalDeCompras + ".");
        System.out.println("La cantidad total de ventas es realizadas es " +
                totalDeVentas + ".");
        System.out.println("El monto total en la caja es " + montoDeCaja + ".");

    }
    public static void comprarCajas(int totalDeCompras,){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de cajas a comprar");
        int compraDeCajas = scanner.nextInt();

        System.out.println("Ingrese el costo de las cajas a comprar");
        double costoDeCajas = scanner.nextDouble();

        double montoTotal = compraDeCajas*costoDeCajas;

        totalDeCompras += compraDeCajas;


        System.out.println("La compra realizada por " + compraDeCajas + " cajas" +
                " al costo de" + costoDeCajas + " es igual a " + montoTotal + ".");

    }
    public static void venderCajas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de cajas a vender");
        int ventaDeCajas = scanner.nextInt();

        System.out.println("Ingrese el costo de las cajas a vender");
        double costoDeVentaDeCajas = scanner.nextDouble();

        double montoDeVentaDeCajasTotal = ventaDeCajas*costoDeVentaDeCajas;


        System.out.println("La compra realizada por " + ventaDeCajas +
                " cajas" + " al costo de" + costoDeVentaDeCajas +
                " es igual a " + montoDeVentaDeCajasTotal + ".");

    }
    public static void finalizarPrograma(int totalDeOperaciones, int totalDeCompras, int totalDeVentas,
                                         double montoDeCaja){
        System.out.println("La cantidad total de operaciones realizadas es " +
                totalDeOperaciones + ".");
        System.out.println("La cantidad total de compras es realizadas es " +
                totalDeCompras + ".");
        System.out.println("La cantidad total de ventas es realizadas es " +
                totalDeVentas + ".");
        System.out.println("El monto total en la caja es " + montoDeCaja + ".");

    }
}
