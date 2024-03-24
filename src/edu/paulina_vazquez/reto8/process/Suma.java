package edu.paulina_vazquez.reto8.process;

public class Suma extends OperacionAritmetica{

    /**
     * Esta clase es la encargada del proceso de la suma, la cual
     * hereda de la clase operacion aritmetica.
     * @param x Primer numero dado por el usuario.
     * @param y Segundo numero dado por el usuario.
     * @return
     */

    @Override
    public int calcular(int x, int y) {
        return x + y;
    }
    /**
     * Retorna la suma entre el primer y segundo número.
     */
}
