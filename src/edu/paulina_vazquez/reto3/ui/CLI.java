package edu.paulina_vazquez.reto3.ui;

import edu.paulina_vazquez.reto3.process.ContadorDeNumeros;
import edu.paulina_vazquez.reto3.process.DiccionarioDePalabras;

import java.util.Scanner;

public class CLI {
    /**
     * Le pregunta al usuario que programa quiere elegir, y dependiendo de esto
     * inicializa el diccionario o el contador, si las opciones no son validas
     * se lo indica.
     */
    public static void launchApp () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el programa desaedo:");
        System.out.println("A. Diccionario de palabras");
        System.out.println("B. Contador de numeros");
        String opcionDePrograma = scanner.nextLine();

        if (opcionDePrograma.equals("A")) {
            while (true) {
                System.out.println("Elija la opcion deseada:");
                System.out.println("A. Enlistar palabras del diccionario");
                System.out.println("B. Buscar palabras del diccionario");
                System.out.println("C. Detalle del diccionario");
                System.out.println("D. Finalizar programa");
                String opcionDelDiccionario = scanner.nextLine();

                switch (opcionDelDiccionario.toUpperCase()) {
                    case "A":
                        DiccionarioDePalabras.enlistarPalabras();
                        break;
                    case "B":
                        DiccionarioDePalabras.buscarPalabras();
                        break;
                    case "C":
                        DiccionarioDePalabras.mostrarDetalles();
                        break;
                    case "D":
                        System.out.println("Programa finalizado.");
                        return;
                    default:
                        System.out.println("Opcion no valida, por favor intente de nuevo.");
                }
            }
        }else if (opcionDePrograma.equals("B")) {
        ContadorDeNumeros.contarNumeros();
        ContadorDeNumeros.imprimirMatriz();
        } else {
            System.out.println("Opcion no valida, por favor ingrese 1 o 2");
        }
        scanner.close();
    }
}