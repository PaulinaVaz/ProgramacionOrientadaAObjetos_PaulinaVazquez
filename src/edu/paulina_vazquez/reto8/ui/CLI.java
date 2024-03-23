package edu.paulina_vazquez.reto8.ui;

import edu.paulina_vazquez.reto8.process.*;

import java.util.Scanner;

public class CLI {
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
        int resultado = 0;

        OperacionAritmetica operacion = null;

        switch (opcionDeOperacion) {
            case 1:
                operacion = new Suma();
                break;
            case 2:
                operacion = new Resta();
                break;
            case 3:
                operacion = new Division();
                break;
            case 4:
                operacion = new Multiplicacion();
                break;
            case 5:
                operacion = new Modulo();
                break;
            case 6:
                operacion = new Potencia();
                break;
            case 7:
                operacion = new Raiz();
                break;
            case 8:
                operacion = new Logaritmo();
                break;
            default:
                System.out.println("Opcion no valida, por favor intentelo de nuevo");
        }
        System.out.print("Ingrese el primer número: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int y = scanner.nextInt();

        resultado = operacion.calcular(x, y);
        System.out.println("El resultado de la operación es: " + resultado);

        scanner.close();
    }
}

