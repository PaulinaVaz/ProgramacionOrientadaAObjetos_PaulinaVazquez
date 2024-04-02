package edu.paulina_vazquez.reto8.process;

import static edu.paulina_vazquez.reto8.ui.Textos.ERROR_MODULO;

public class Modulo extends Resta {

    /**
     * Esta clase es la encargada del proceso del modulo, la cual
     * hereda de la clase resta.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return el resultado del modulo
     */

    @Override
    public int calcular(int x, int y) {

        /**
         * Se almacena el dividendo y se itera hasta que el dividendo
         * sea menor que el divisor, finalmente retorna el residuo de
         * la división.
         */

        if (y == 0) {
            throw new ArithmeticException(ERROR_MODULO);
        }
        int resultado = x;
        while (resultado >= y) {
            resultado = super.calcular(resultado, y);
        }
        return resultado;
    }
}
