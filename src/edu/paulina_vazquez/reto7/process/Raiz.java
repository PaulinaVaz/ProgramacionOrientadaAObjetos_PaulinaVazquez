package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Raiz {

    /**
     * Esta clase se encarga del proceso de logaritmos, esta construida
     * con Chat GPT como apoyo.
     */

    public static void calcularRaiz(){

        /**
         * Le pide los datos necesarios al usuario y devuelve los
         * resultados en pantalla.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();
        double resultado = calcularRaizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + resultado);
        scanner.close();
    }

    public static double calcularRaizCuadrada(double numero) {
        /**
         * Método para calcular la raíz cuadrada de un número mediante
         * un bucle que refina la estimacion de la raiz cuadrada.
         */
        double estimacion = sumar(numero, dividir(2, 1));
        double incremento = dividir(estimacion, 10);
        double cuadrado = 0;
        double resultado = 0;

        while (true) {
            cuadrado = multiplicar(estimacion, estimacion);
            if (cuadrado <= numero && (cuadrado + multiplicar(2 * resultado, incremento) + incremento) > numero) {
                break;
            }
            if (cuadrado > numero) {
                estimacion -= incremento;
            } else {
                estimacion += incremento;
            }
            incremento = sumar(incremento, sumar(incremento, sumar(incremento, sumar(incremento, sumar(incremento, sumar(incremento, sumar(incremento, sumar(incremento, sumar(incremento, incremento)))))))));
        }

        return estimacion;
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

        /**
         * Su función es dividir dos números utilizando solo suma,
         * ademas se utiliza un bucle para acumular num2 hasta
         * alcanzar o superar num1, tambien utiliza la función sumar
         * para sumar num2 y se va incrementando el contador de la
         * división.
         */

        double resultado = 0;
        double acumulador = 0;
        while (acumulador <= num1) {
            acumulador += num2;
            resultado++;
        }
        return resultado - 1;
    }

    public static double multiplicar(double num1, double num2) {

        /**
         * Su función es multiplicar dos números utilizando solo suma.
         */

        double resultado = 0;
        for (int i = 0; i < num2; i++) {
            resultado = sumar(resultado, num1);
        }
        return resultado;
    }
}
