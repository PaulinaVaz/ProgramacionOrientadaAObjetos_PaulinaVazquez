package edu.paulina_vazquez.reto8.process;

public class Multiplicacion extends Suma {

    /**
     * Esta clase es la encargada del proceso de la multiplicacion, la cual
     * hereda de la clase suma.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return el resultado de la multiplicacion
     */
    @Override
    public int calcular(int x, int y) {

        /**
         * Se realiza la multiplicación sumando 'x' 'y' veces y retorna
         * el resultado de la multiplicación.
         */

        int resultado = 0;
        for (int i = 0; i < y; i++) {
            resultado = super.calcular(resultado, x);
        }
        return resultado;
    }
}
