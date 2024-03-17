package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Modulo {

    /**
     * Esta clase es la encargada del proceso del modulo.
     */
    public static void calcularModulo(){

        /**
         * El usuario ingresa el dividendo y el divisor para que los
         * datos sean capturados por el programa, se efectua la division
         * y se muestra el residuo como resultado.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        double resultado = dividendo;
        while (resultado >= divisor) {
            resultado -= divisor;
        }
        System.out.println("El resultado del módulo es: " + resultado);
    }
}
