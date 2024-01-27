package edu.paulina_vazquez.reto1.process;

import java.util.Scanner;

public class CalculadoraMetabolismoBasal{

    /**
     * Esta clase es la encargada de calcular el metabolimo
     * basal del usuario mediante su peso, su estatura, edad
     * y sexo. Si el sexo de la persona no es valido se le
     * sera informado por un mensaje.
     */

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

        if (sexo.equals("mujer")){
            double metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
            System.out.println("Su metabolismo basal es " + metabolismoBasal);
        } else if (sexo.equals("hombre")) {
            double metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
            System.out.println("Su metabolismo basal es " + metabolismoBasal);
        } else {
            System.out.println("Sexo no valido, por favor intente de nuevo");
        }
    }
}
