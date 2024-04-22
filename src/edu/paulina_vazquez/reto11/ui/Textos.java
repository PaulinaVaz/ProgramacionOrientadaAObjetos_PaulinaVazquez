package edu.paulina_vazquez.reto11.ui;

public abstract class Textos {
    /**
     * Esta clase se encargada de heredar a las clases esp y
     * eng las variables relacionadas con el texto del programa.
     */

    public abstract String bienvenida();
    public abstract String menu();
    public abstract String opcion_invalida();
    public abstract String palabras_repetidas ();
    public abstract String palabra ();
    public abstract String repeticiones ();
    public abstract String error_lectura ();

    public static void escogerIdioma (){

        /**
         * Se encarga de mostrarle al usuario el menu de
         * idiomas disponibles para el programa.
         */

        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("1. Español");
        System.out.println("2. English");
    }
    public static Textos crearTextos(String idioma){
        /**
         * Direcciona el idioma escogido por el usuario para
         * mostrar los textos en el idioma correspondiente.
         */
        switch (idioma){
            case "Español":
                return new Esp();
            case "English":
                return new Eng();
            default:
                throw new IllegalArgumentException("Idioma no válido");
        }
    }
}
