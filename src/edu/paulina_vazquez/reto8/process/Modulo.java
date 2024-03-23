package edu.paulina_vazquez.reto8.process;

public class Modulo extends Resta {
    @Override
    public int calcular(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("El módulo no puede ser cero.");
        }
        int resultado = x;
        while (resultado >= y) {
            resultado = super.calcular(resultado, y);
        }
        return resultado;
    }
}
