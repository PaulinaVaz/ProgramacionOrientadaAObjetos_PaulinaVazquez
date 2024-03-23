package edu.paulina_vazquez.reto8.process;

public class Division extends Resta{
    /**
     * Esta clase es la encargada del proceso de la division, la cual
     * hereda de la clase resta.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return el resultado de la division.
     */
    public int calcular(int x, int y) {

        /**
         * Utiliza la variable resultado para almacenar el resultado de la división,
         * la sumaRestada realizar la división. Se realiza la resta del
         * divisor a la sumaRestada y el resultado se va incrementando.
         */

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


