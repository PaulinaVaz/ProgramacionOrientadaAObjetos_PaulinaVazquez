package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Division {
    public static void calcularDivision(){
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
