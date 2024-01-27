package edu.paulina_vazquez.reto1.process;

import java.util.Scanner;

public class CalculadoraMasaCorporal {
    /**
     * Esta clase es la encargada de calcular el indice
     * de masa corporal del usuario mediante su peso y
     * su estatura. Se clasificara su condicion
     * dependiendo de su indice de masa corporal.
     */
    public static void calcularIndiceMasaCorporal(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su estatura en cm");
        double estatura = scanner.nextDouble();
        System.out.println("Ingrese su peso en kg");
        double peso = scanner.nextDouble();

        double indiceMasaCorporal = peso/((estatura/100)*(estatura/100));
        System.out.println("Su indice de masa corporal es " + indiceMasaCorporal);

        if (indiceMasaCorporal <= 18.9){
            System.out.println("Peso bajo");
        } else if (indiceMasaCorporal <= 24.99) {
            System.out.println("Peso normal");
        } else if (indiceMasaCorporal <= 29.99) {
            System.out.println("Sobrepeso");
        } else if (indiceMasaCorporal <= 34.99) {
            System.out.println("Obesidad leve");
        } else if (indiceMasaCorporal <= 39.99) {
            System.out.println("Obesidad media");
        }else{
            System.out.println("obesidad morbida");
        }
    }
}

