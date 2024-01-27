package edu.paulina_vazquez.reto1.process;

import java.util.Scanner;

public class CalculadoraMetabolismoBasal{
    public static void calcularMetabolismoBasal (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su estatura en cm");
        double estatura = scanner.nextDouble();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su sexo: mujer / hombre ");
        String sexo = scanner.next();

        if (sexo == "mujer"){
            double metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
            System.out.println("Su metabolismo basal es" + metabolismoBasal);
        }else{
            double metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
            System.out.println("Su metabolismo basal es " + metabolismoBasal);
        }
    }
}
