package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Potencia {


    public static void calcularPotencia(){
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
