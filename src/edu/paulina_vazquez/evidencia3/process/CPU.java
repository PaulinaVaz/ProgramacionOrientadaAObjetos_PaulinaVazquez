package edu.paulina_vazquez.evidencia3.process;

import java.util.Random;

public class CPU extends Jugador{
    public CPU(String nombre, char simbolo) {
        super(nombre, simbolo);
    }

    @Override
    public void realizarMovimiento(Tablero tablero) {
        // Lógica de movimiento de la CPU
        Random random = new Random();
        int row, col;
        do {
            row = random.nextInt(3);
            col = random.nextInt(3);
        } while (!tablero.colocarSimbolo(row, col, simbolo));
        System.out.println("La CPU " + nombre +
                " ha realizado su movimiento en la posición (" + row + ", " + col + ")");
    }
}

