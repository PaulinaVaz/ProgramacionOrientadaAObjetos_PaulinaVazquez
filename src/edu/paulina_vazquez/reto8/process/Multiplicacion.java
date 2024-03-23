package edu.paulina_vazquez.reto8.process;

public class Multiplicacion extends Suma {

    @Override
    public int calcular(int x, int y) {
        int resultado = 0;
        for (int i = 0; i < y; i++) {
            resultado = super.calcular(resultado, x);
        }
        return resultado;
    }
}
