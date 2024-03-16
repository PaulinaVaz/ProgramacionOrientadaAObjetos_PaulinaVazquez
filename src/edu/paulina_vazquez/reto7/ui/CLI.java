package edu.paulina_vazquez.reto7.ui;

import edu.paulina_vazquez.reto7.process.Resta;
import edu.paulina_vazquez.reto7.process.Suma;

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
        System.out.println("9. Salir del programa");

        Scanner scanner = new Scanner(System.in);
        int opcionDeOperacion = scanner.nextInt();
        do {
            switch (opcionDeOperacion) {
                case 1:
                    Suma.calcularSuma();
                    break;
                case 2:
                    Resta.calcularResta();
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida, por favor intentelo de nuevo");
            }
        } while (opcionDeOperacion != 9);
        scanner.close();
    }
}
