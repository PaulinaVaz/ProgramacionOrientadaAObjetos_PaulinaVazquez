package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Potencia {

    /**
     * Esta clase se necarga del proceso de las potencias.
     */

    public static void calcularPotencia(){

        /**
         * El usuario ingresa la base y el exponente y despues
         * del proceso se muestra el resultado en la pantalla.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        double resultado = potencia(base, exponente);
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

        scanner.close();
    }

    public static double potencia(double base, int exponente) {

        /**
         * Su suncion es calcular la potencia inicializando el
         * exponente como 1, y en caso de que el numero no sea
         * 0 se multiplica por si mismo el numero de veces que
         * indique el exponente.
         */

        if (exponente == 0) {
            return 1;
        }

        double resultado = base;
        double multiplicador = base;

        for (int i = 1; i < exponente; i++) {
            for (int j = 1; j < base; j++) {
                resultado += multiplicador;
            }
            multiplicador = resultado;
        }

        return resultado;
    }
}
