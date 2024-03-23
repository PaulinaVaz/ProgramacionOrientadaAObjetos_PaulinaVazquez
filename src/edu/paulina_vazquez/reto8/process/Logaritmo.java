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

        if (x <= 0 || y <= 1) {
            throw new ArithmeticException(ERROR_LOGARITMO);
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
