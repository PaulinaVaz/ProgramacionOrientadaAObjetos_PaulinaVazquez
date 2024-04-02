package edu.paulina_vazquez.reto8.process;

public class Raiz extends Multiplicacion{

    /**
     * Esta clase es la encargada del proceso de la raiz, la cual
     * hereda de la clase multiplicacion.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return resultado de la raiz.
     */
    @Override
    public int calcular(int x, int y) {

        /**
         * Se inicializa el resultado como 1 y se realiza la
         * multiplicación 'y' veces para despues retornar el
         * resultado de la raíz.
         */

        int raiz;
        int potenciaAcumulada = 0;
        int validacion = 0;
        int aproximacion = 1;

        while (potenciaAcumulada < x) {
            validacion = aproximacion;
            potenciaAcumulada = 1;
            for (int i = 0; i < y; i++) {
                potenciaAcumulada = super.calcular(potenciaAcumulada, aproximacion);
            }
            aproximacion++;
        }
        raiz = validacion;

        return raiz;
    }
}
