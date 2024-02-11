package edu.paulina_vazquez.reto3.process;

import java.util.Scanner;

public class DiccionarioDePalabras {
    /**
     * Variables necesarias para las acciones a realizar.
     */
    private static String[] palabras;
    private static String[] significados;
    private static final int cantidadPalabras = 10;


    /**
     * Este importa los arreglos desde la clase Main.
     * @param significados
     * @param palabras
     */

    public DiccionarioDePalabras(String[] significados, String[] palabras) {
        this.palabras = palabras;
        this.significados = significados;
    }

    public static void enlistarPalabras() {
        System.out.println("Las palabras que contiene el diccionario son: ");
        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    public static void buscarPalabras() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar");
        String palabra = scanner.nextLine();
        boolean palabraEncontrada = false;

        for (int i = 0; i < cantidadPalabras; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                System.out.println("El significado de " + palabra + " es " +
                        significados[i]);
                palabraEncontrada = true;
                break;
            }
        }
        if (!palabraEncontrada){
            System.out.println("Esta palabra no se encuentra en el diccionario.");
        }
    }
    public static void mostrarDetalles (){
        System.out.println("La cantidad total de palabras existentes en el " +
                "diccionarios son " + cantidadPalabras);
        System.out.println("Lista de palabras con detalle: ");
        for (int i = 0; i < cantidadPalabras; i ++){
            System.out.println((i + 1) + ". Palabra: " + palabras[i] + ", la " +
                    "cantidad de caracteres en la palabra son: " +
                    palabras[i].length() + ", la cantidad de caracteres en el " +
                    "significado son: " + significados[i].length());
        }
    }
}
