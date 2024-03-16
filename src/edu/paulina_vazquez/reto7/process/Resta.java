package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Resta {
    public static void calcularResta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea restar: ");
        int cantidadNumeros = scanner.nextInt();

        System.out.print("Ingrese el número inicial: ");
        double resta = scanner.nextDouble();

        for (int i = 1; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            resta -= numero;
        }

        System.out.println("El resultado de la resta es " + resta);
    }
}
