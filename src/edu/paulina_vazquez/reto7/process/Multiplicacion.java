package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Multiplicacion {
    /**
     * Esta clase es la encargada del proceso de las multiplicaciones.
     */
    public static void calcularMultiplicacion(){

        /**
         * Se le pide al usuario que ingrese dos numeros para realizar
         * la multiplicacion y el segundo numero se va sumando hasta que
         * las veces sumadas son iguales a primer numero por ultimo
         * muestra el resultado de la operacion.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
