package edu.paulina_vazquez.reto3.process;

import java.util.Random;
import java.util.Scanner;

public class ContadorDeNumeros {
    static Scanner scanner = new Scanner(System.in);
    static int filas;
    static int columnas;
    static int[][] matriz;
    public static void contarNumeros(){
        System.out.println("Ingrese el numero de filas");
        filas = scanner.nextInt();
        System.out.println("Ingrese el numero de columnas");
        columnas = scanner.nextInt();
        matriz = new int [filas][columnas];

        int total = 0;
        int [] paresFilas = new int[filas];
        int [] paresColumnas = new int[columnas];
        int [] imparesFilas = new int[filas];
        int [] imparesColumnas = new int[columnas];

        Random random = new Random();
        for (int i = 0; i < filas; i++){
            for ( int j = 0; j < columnas; j++){
                matriz [i][j] = random.nextInt(100)+1;
                if (matriz[i][j] %2 == 0){
                    paresFilas [i]++;
                    paresColumnas [j]++;
                }else {
                    imparesFilas [i]++;
                    imparesColumnas [j]++;
                }
                total += matriz[i][j];
            }
        }
        System.out.println("Cantidad de numeros pares e impares por fila");
        for (int i = 0; i < filas; i++){
            System.out.println("Fila " + (i + 1) + "= pares: " + paresFilas[i]
                    + ", impares: " +imparesFilas[i]);
        }
        System.out.println("Cantidad de numeros pares e impares por columna");
        for (int j = 0; j < columnas; j++){
            System.out.println("Columna " + (j + 1) + "= pares: " + paresColumnas[j]
                    + ", impares: " +imparesColumnas[j]);
        }
        System.out.println("La suma total de los numeros es "+total);
    }
    public static void imprimirMatriz(){
        Random random = new Random();
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
