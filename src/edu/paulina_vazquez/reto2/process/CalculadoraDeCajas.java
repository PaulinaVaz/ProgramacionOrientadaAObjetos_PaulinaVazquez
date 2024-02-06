package edu.paulina_vazquez.reto2.process;


import java.util.Scanner;

public class CalculadoraDeCajas {

    /**
     * Estas variables son las encargadas de guardar la
     * informacion necesaria para elaborar las operaciones
     * de programa.
     */
    public static double totalDeIngresos = 0;
    public static double totalDeEgresos = 0;
    public static int totalDeCompras = 0;
    public static int totalDeVentas = 0;
    public static int  montoTotal = 0;

    /**
     * Se encarga de mostrar un reporte la cantidad total
     * de ventas y compras, los ingresos por ventas, los
     * egresos por compras y el monto total en la caja.
     */

    public static void mostrarReporte() {

        System.out.println("La cantidad total de compras es realizadas es " +
                totalDeCompras + ".");
        System.out.println("La cantidad total de ventas es realizadas es " +
                totalDeVentas + ".");
        System.out.println("El monto total en la caja es " + montoTotal + ".");
        System.out.println("El total de ingresos son: " + totalDeIngresos);
        System.out.println("El total de egresos son: " + totalDeEgresos);
        System.out.println("El monto total en la caja es " + montoTotal + ".");
    }

    /**
     * Se encarga de captar la cantidad de cajas a comprar
     * y el costo por unidad de las mismas e informa del
     * monto de esta operacion, tambien almacena los datos
     * para el reporte final.
     */

    public static void comprarCajas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de cajas a comprar");
        int compraDeCajas = scanner.nextInt();

        System.out.println("Ingrese el costo de las cajas a comprar");
        double costoDeCajas = scanner.nextDouble();

        double montoDeCajas = compraDeCajas*costoDeCajas;

        /**
         * Las lineas de codigo 58,59 y 60 fueron programadas con
         * referencia en chat gpt.
         */
        totalDeCompras += compraDeCajas;
        totalDeEgresos += montoDeCajas;
        montoTotal -= montoDeCajas;

        System.out.println("La compra realizada por " + compraDeCajas + " cajas" +
                " al costo de" + costoDeCajas + " es igual a " + montoDeCajas + ".");

    }
    /**
     * Se encarga de captar la cantidad de cajas a vender
     * y el costo por unidad de las mismas e informa del
     * monto de esta operacion, tambien almacena los datos
     * para el reporte final.
     */
    public static void venderCajas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de cajas a vender");
        int ventaDeCajas = scanner.nextInt();

        System.out.println("Ingrese el costo de las cajas a vender");
        double costoDeVentaDeCajas = scanner.nextDouble();

        double montoDeVentaDeCajasTotal = ventaDeCajas*costoDeVentaDeCajas;

        totalDeVentas += ventaDeCajas;
        totalDeIngresos += montoDeVentaDeCajasTotal;
        montoTotal += montoDeVentaDeCajasTotal;

        System.out.println("La compra realizada por " + ventaDeCajas +
                " cajas" + " al costo de" + costoDeVentaDeCajas +
                " es igual a " + montoDeVentaDeCajasTotal + ".");

    }

    /**
     * Este finaliza el programa y muestra un breve resumen
     * en el que se incluye el total de operaciones, el
     * total de compras y ventas, los ingresos y egresos y
     * finalmente el monto total; tambien muestra un mensaje
     * despedida al usuario.
     */
    public static void finalizarPrograma(){
        System.out.println("La cantidad total de compras es realizadas es " +
                totalDeCompras + ".");
        System.out.println("La cantidad total de ventas es realizadas es " +
                totalDeVentas + ".");
        System.out.println("El total de ingresos son: " + totalDeIngresos);
        System.out.println("El total de egresos son: " + totalDeEgresos);
        System.out.println("El monto total en la caja es " + montoTotal + ".");
        System.out.println("Gracias por utilizar nuestro sistema, esperamos" +
                "regrese pronto.");

    }
}
