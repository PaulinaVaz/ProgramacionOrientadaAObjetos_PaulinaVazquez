package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Suma {
    public static void calcularSuma(){
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
