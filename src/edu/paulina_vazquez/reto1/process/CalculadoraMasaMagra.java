package edu.paulina_vazquez.reto1.process;

import java.util.Scanner;

public class CalculadoraMasaMagra{
    public static void calcularMasaMagra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su estatura en cm");
        double estatura = scanner.nextDouble();
        System.out.println("Ingrese su sexo: mujer / hombre ");
        String sexo = scanner.next();
        if (sexo == "mujer"){
            double masaMagra = (1.07*peso)-148*((peso*peso)/(estatura*estatura));
            System.out.println("Su masa magra es "+masaMagra);
        }else {
            double masaMagra = (1.10*peso)-128*((peso*peso)/(estatura*estatura));
            System.out.println("Su masa magra es " + masaMagra);
        }
    }
}

