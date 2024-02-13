package edu.paulina_vazquez.reto3.process;

import java.util.Scanner;

public class DiccionarioDePalabras {
    /**
     *Variables necesarias para la correcta funcion de los
     *metodos de esta clase.
     */
    private static String[] palabras;
    private static String[] significados;
    private static final int cantidadPalabras = 10;

    public DiccionarioDePalabras(String[] significados, String[] palabras) {
        /**
         * Contiene los arreglos establecidos en la clase Main.
         */
        this.palabras = palabras;
        this.significados = significados;
    }

    public static void enlistarPalabras() {
        /**
         * Elabora la lista de palabras que cpntiene e;l diccionario y se las
         * muestra al usuario.
         */
        System.out.println("Las palabras que contiene el diccionario son: ");
        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.println((i + 1) + ". " + palabras[i]);
        }
    }

    public static void buscarPalabras() {
        /**
         * Se encarga de buscar una palabra en el diccionario, esta es
         * ingresada por el usuario, y muestra su significado.
         */
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
        /**
         * Su funcion es mostrar las palabras existentes en el diccionario,
         * cuantos caracteres contienen y la cantidad de caracteres de su
         * significado.
         */
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
