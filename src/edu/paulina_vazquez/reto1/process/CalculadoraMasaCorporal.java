package edu.paulina_vazquez.reto1.process;

/**
 * Utilidad
 */
public class CalculadoraMasaCorporal {
    /**
     * Este metodo sirve para calcular el indice de masa corporal de una persona
     * @param estatura de la persona en cm
     * @param peso de la persona en kg
     * @return indice de masa corporal
     */
    public static double calcularIndiceMasaCorporal(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su estatura en cm");
        double estatura = scanner.nextDouble();
        System.out.println("Ingrese su peso en kg");
        double peso = scanner.nextDouble();

        estatura / = 100;
        double indiceMasaCorporal = return peso/(estatura*estatura);
        System.out.println("Su indice de masa corporal es " + indiceMasaCorporal);
    }
    public static String clasificarPeso(double indiceMasaCorporal){


        }
    }
}


