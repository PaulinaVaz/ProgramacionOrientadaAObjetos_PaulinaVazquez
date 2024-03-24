package edu.paulina_vazquez.reto8.ui;

public class Textos {

    /**
     * Esta clase es la encargada de almacenar las variables
     * que se usan para mostrar textos al usuario.
     */

    public static String BIENVENIDA;
    public static String MENU;
    public static String OPCION_INVALIDA;
    public static String INGRESO_PRIMER_NUMERO;
    public static String INGRESO_SEGUNDO_NUMERO;
    public static String RESULTADO;
    public static String ERROR_DIVISION;
    public static String ERROR_MODULO;
    public static String ERROR_LOGARITMO;

    public static void setEspañol() {

        /**
         * Configura las variables en espanol.
         */

        BIENVENIDA = Español.BIENVENIDA;
        MENU = Español.MENU;
        OPCION_INVALIDA = Español.OPCION_INVALIDA;
        INGRESO_PRIMER_NUMERO = Español.INGRESO_PRIMER_NUMERO;
        INGRESO_SEGUNDO_NUMERO = Español.INGRESO_SEGUNDO_NUMERO;
        RESULTADO = Español.RESULTADO;
        ERROR_DIVISION = Español.ERROR_DIVISION;
        ERROR_MODULO = Español.ERROR_MODULO;
        ERROR_LOGARITMO = Español.ERROR_LOGARITMO;
    }

    /**
     * Configura las variables en ingles.
     */

    public static void setEnglish() {
        BIENVENIDA = English.BIENVENIDA;
        MENU = English.MENU;
        OPCION_INVALIDA = English.OPCION_INVALIDA;
        INGRESO_PRIMER_NUMERO = English.INGRESO_PRIMER_NUMERO;
        INGRESO_SEGUNDO_NUMERO = English.INGRESO_SEGUNDO_NUMERO;
        RESULTADO = English.RESULTADO;
        ERROR_DIVISION = English.ERROR_DIVISION;
        ERROR_MODULO = English.ERROR_MODULO;
        ERROR_LOGARITMO = English.ERROR_LOGARITMO;
    }
}
