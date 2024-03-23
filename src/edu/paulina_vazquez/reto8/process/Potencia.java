package edu.paulina_vazquez.reto8.process;

public class Potencia extends Multiplicacion {

    @Override
    public int calcular(int x, int y) {
        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado = super.calcular(resultado, x);
        }
        return resultado;
    }
}
