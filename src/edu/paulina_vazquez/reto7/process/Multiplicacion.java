package edu.paulina_vazquez.reto7.process;

import java.util.Scanner;

public class Multiplicacion {
    public static void calcularMultiplicacion(){
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
