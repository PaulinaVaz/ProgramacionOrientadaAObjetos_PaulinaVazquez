package edu.paulina_vazquez.reto8.process;

import static edu.paulina_vazquez.reto8.ui.Textos.ERROR_LOGARITMO;

public class Logaritmo extends Division{

    /**
     * Esta clase es la encargada del proceso de la division, la cual
     * hereda de la clase division.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return el resultado del logaritmo
     */

    public int calcular(int x, int y) {

        /**
         * Se itera hasta que la potencia de la base sea mayor que el
         * número y se retorna el logaritmo entero.
         */

        if (x <= 1 || y <= 0) {
            throw new ArithmeticException(ERROR_LOGARITMO);
        }

        int resultado = 0;
        int argumento = x;
        while (argumento > 1){
            argumento = super.calcular(argumento, y);
            resultado++;
        }
        return resultado;
    }
}
