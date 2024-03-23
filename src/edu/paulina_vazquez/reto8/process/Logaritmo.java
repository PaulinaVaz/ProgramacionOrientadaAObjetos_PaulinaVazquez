package edu.paulina_vazquez.reto8.process;

public class Logaritmo extends Division{
    public int calcular(int x, int y) {
        if (x <= 0 || y <= 1) {
            throw new ArithmeticException("El logaritmo no está definido para números no positivos ni bases menores o iguales a 1.");
        }

        int logaritmo = 0;
        int potencia = 1;
        while (potencia <= x) {
            potencia = super.calcular(potencia, y);
            logaritmo++;
        }
        return logaritmo - 1;
    }
}
