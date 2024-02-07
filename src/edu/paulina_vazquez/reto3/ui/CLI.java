package edu.paulina_vazquez.reto3.ui;

import edu.paulina_vazquez.reto3.process.ContadorDeNumeros;
import java.util.Scanner;

import static edu.paulina_vazquez.reto3.process.ContadorDeNumeros.contarNumeros;
import static edu.paulina_vazquez.reto3.process.DiccionarioDePalabras.enlistarPalabras;

public class CLI {
    public static void showMenu (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige el programa desaedo:");
        System.out.println("1. Diccionario de palabras");
        System.out.println("2. Contador de numeros");
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
                        enlistarPalabras ();
                        break;
                    case "B":
                        break;
                    case "C":
                        break;
                    case "D":
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opcion no valida, por favor intente de nuevo.");
                }
            }else if ( opcionDePrograma == 2){
            contarNumeros();
            }else {
                System.out.println("Opcion no valida, por favor ingrese 1 o 2");
            }
        }
    }
}