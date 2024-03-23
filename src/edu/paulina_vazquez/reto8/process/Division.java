package edu.paulina_vazquez.reto8.process;

public class Division extends Resta{
    public int calcular(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        int resultado = 0;
        int sumaRestada = 0;
        while (sumaRestada + y <= x) {
            sumaRestada = super.calcular(sumaRestada, y);
            resultado++;
        }
        return resultado;
    }
}


