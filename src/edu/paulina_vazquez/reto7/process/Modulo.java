package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Modulo {
    public static void calcularModulo(){

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
