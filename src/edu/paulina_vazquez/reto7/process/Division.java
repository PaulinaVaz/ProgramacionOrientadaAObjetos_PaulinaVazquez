package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Division {
    /**
     * Esta clase se encarga del proceso de division.
     */
    public static void calcularDivision(){

        /**
         * Se le pide al usario que ingrese dos datos, el divisor y el
         * dividendo, el dividendo se va restando n cantidad de veces
         * hasta igualar el divisor y se muestra el resultado.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        double resultado = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            resultado++;
        }
        System.out.println("El resultado de la división es: " + resultado);
    }
}
