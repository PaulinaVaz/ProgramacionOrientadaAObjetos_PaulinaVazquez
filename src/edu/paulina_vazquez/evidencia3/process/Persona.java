package edu.paulina_vazquez.evidencia3.process;

import java.util.Scanner;

public class Persona extends Jugador{
    public Persona(String nombre, char simbolo) {
        super(nombre, simbolo);
    }

    @Override
    public void realizarMovimiento(Tablero tablero) {
        // Lógica de movimiento para el jugador persona
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.print(nombre + ", ingresa la fila y columna para tu movimiento (ejemplo: 0 1): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!tablero.colocarSimbolo(row, col, simbolo));
    }
}
