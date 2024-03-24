package edu.paulina_vazquez.reto8.process;

public class Resta extends OperacionAritmetica{

    /**
     * Esta clase es la encargada del proceso de la resta, la cual
     * hereda de la clase operacion aritmetica.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return el resultado de la resta.
     */

    @Override
    public int calcular(int x, int y) {
        return x - y;
    }
    /**
     * Retorna la resta entre el primer y segundo número.
     */
}

