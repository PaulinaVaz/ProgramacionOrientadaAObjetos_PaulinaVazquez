package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Logaritmo {

    /**
     * Esta clase se encarga del proceso de logaritmos, esta construida
     * con Chat GPT como apoyo.
     */
    public static void calcularLogaritmo() {

        /**
         *Se le pide al usuario que ingrese el numero al que se le desea
         * calcular el logaritmo, sumamos términos hasta alcanzar la
         * precisión deseada, y se muestra el resultado.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número para calcular su logaritmo natural: ");
        double x = scanner.nextDouble();

        if (x <= 0) {
            System.out.println("El logaritmo natural no está definido para números no positivos.");
            return;
        }

        double resultado = calcularLogaritmo(x);
        System.out.println("El logaritmo natural de " + x + " es aproximadamente: " + resultado);

        scanner.close();
    }

    public static double calcularLogaritmo(double x) {
        double lnX = 0;
        double termino = sumar(restar(x, 1), restar(1, x));
        double potencia = termino;
        double denominador = 1;
        double terminoActual;

        /**
         * Se suman los datos hasta alcanzar la precision deseada.
         */

        for (int i = 1; i <= 1000; i += 2) {

            /**
             * Suma términos de la serie hasta alcanzar la precisión
             * deseada.
             */

            terminoActual = dividir(potencia, denominador);
            lnX = sumar(lnX, terminoActual);
            potencia = sumar(potencia, potencia);
            denominador += 2;
        }

        return sumar(lnX, lnX);
    }

    public static double sumar(double num1, double num2) {
        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        return resultado;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double dividir(double num1, double num2) {
        double resultado = 0;
        while (num1 >= num2) {
            num1 = restar(num1, num2);
            resultado++;
        }
        return resultado;
    }
}