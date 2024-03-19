package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Suma {
    /**
     * Esta clase lleva a cabo el proceso de las sumas.
     */
    public static void calcularSuma(){

        /**
         * El usuario debera ingresar la cantidad de numeros que desea sumar y
         * luego el programa captura el valor de cada un de estos para despues
         * realizar la suma de todos los numeros y mostrar el resultado.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea sumar: ");
        int cantidadNumeros = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

        System.out.println("El resultado de la suma es " + suma);
    }
}
