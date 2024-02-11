package edu.paulina_vazquez.reto3.ui;

import edu.paulina_vazquez.reto3.process.ContadorDeNumeros;
import edu.paulina_vazquez.reto3.process.DiccionarioDePalabras;

import java.util.Scanner;

public class CLI {
    public static void launchApp () {
        System.out.println("Elige el programa desaedo:");
        System.out.println("1. Diccionario de palabras");
        System.out.println("2. Contador de numeros");
        Scanner scanner = new Scanner(System.in);
        int opcionDePrograma = scanner.nextInt();
        while (true){
            if (opcionDePrograma == 1){
                System.out.println("Elija la opcion deseada:");
                System.out.println("A. Enlistar palabras del diccionario");
                System.out.println("B. Buscar palabras del diccionario");
                System.out.println("C. Detalle del diccionario");
                System.out.println("D. Finalizar programa");
                String opcionDelDiccionario = scanner.nextLine();

                switch (opcionDelDiccionario.toUpperCase()){
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
                        scanner.close();
                        System.out.println("Programa finalizado.");
                        return;
                    default:
                        System.out.println("Opcion no valida, por favor intente de nuevo.");
                }
            }else if ( opcionDePrograma == 2){
                Scanner scanner = new Scanner(System.in);
                int filas = scanner.nextInt();
                int columnas = scanner.nextInt();
                ContadorDeNumeros.contarNumeros();
                ContadorDeNumeros.imprimirMatriz();
            }else {
                System.out.println("Opcion no valida, por favor ingrese 1 o 2");
            }
        }
    }
}