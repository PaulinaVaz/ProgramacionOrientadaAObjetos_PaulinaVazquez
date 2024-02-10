package edu.paulina_vazquez.reto3.process;

import java.util.Random;
import java.util.Scanner;

public class ContadorDeNumeros {
    Scanner scanner = new Scanner(System.in);

    int filas = scanner.nextInt();
    int columnas = scanner.nextInt();
    int[][] matriz = new int[filas][columnas];
    public void contarNumeros(){
        System.out.println("Ingrese el numero de filas");
        System.out.println("Ingrese el numero de columnas");

        int total = 0;
        int [] paresFilas = new int[filas];
        int [] paresColumnas = new int[columnas];
        int [] imparesFilas = new int[filas];
        int [] imparesColumnas = new int[columnas];

        for (int i = 0; i < filas; i++){
            for ( int j = 0; j < columnas; j++){
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
    public void imprimirMatriz (){
        Random random = new Random();
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz [i][j] = random.nextInt(100) + 1;
            }
        }
    }
}
