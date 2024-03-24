package edu.paulina_vazquez.reto8.process;

public class Potencia extends Multiplicacion {

    /**
     * Esta clase es la encargada del proceso de la multiplicacion, la cual
     * hereda de la clase multiplicacion.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return el resultado de la potencia
     */

    @Override
    public int calcular(int x, int y) {

        /**
         * Realiza la potenciación multiplicando 'x' 'y' veces y
         * retorna el resultado de la potencia.
         */

        int resultado = 1;
        for (int i = 0; i < y; i++) {
            resultado = super.calcular(resultado, x);
        }
        return resultado;
    }
}
