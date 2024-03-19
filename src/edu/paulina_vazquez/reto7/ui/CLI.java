package edu.paulina_vazquez.reto7.ui;

import edu.paulina_vazquez.reto7.process.*;

import java.util.Scanner;

public class CLI {
    /**
     * Esta clase es la encargado de mostrar el menu al usuario y
     * capturar la operacion que se desea realizar.
     */
    public static void showMenu(){
        System.out.println("Bienvenido a la calculadora aritmetica");
        System.out.println("Elija la operacion que desea ingresar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Division");
        System.out.println("4. Multiplicacion");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Raiz");
        System.out.println("8. Logaritmo");

        /**
         * Dependiendo de la opcion seleccionada por el usuario se escoge la clase que
         * llevara acabo el proceso hasta mostrar el resultado.
         */

        Scanner scanner = new Scanner(System.in);
        int opcionDeOperacion = scanner.nextInt();

        while (opcionDeOperacion >= 1){
            switch (opcionDeOperacion) {
                case 1:
                    Suma.calcularSuma();
                    break;
                case 2:
                    Resta.calcularResta();
                    break;
                case 3:
                    Multiplicacion.calcularMultiplicacion();
                    break;
                case 4:
                    Division.calcularDivision();
                    break;
                case 5:
                    Modulo.calcularModulo();
                    break;
                case 6:
                    Potencia.calcularPotencia();
                    break;
                case 7:
                    Raiz.calcularRaiz();
                    break;
                case 8:
                    Logaritmo.calcularLogaritmo();
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intentelo de nuevo");
            }
        }
    }
}
