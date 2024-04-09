package edu.paulina_vazquez.reto9.ui;

public class Eng extends Textos{

    /**
     * Hereda de Textos y almacena los escritos a mostrar al usuario
     * en ingles.
     * @return el texto en ingles segun sea el caso.
     */

    @Override
    public String bienvenida() {
        return "Welcome to the word counter.";
    }

    @Override
    public String menu() {
        return "Choose the desired book: ";
    }

    @Override
    public String opcion_invalida() {
        return "Invalid option, please try again.";
    }

    @Override
    public String palabras_repetidas() {
        return "The 10 Most Common Words in the Book ";
    }

    @Override
    public String palabra() {
        return ". Word: ";
    }

    @Override
    public String repeticiones() {
        return ", repetitions: ";
    }

    @Override
    public String error_lectura() {
        return "Error reading the book file.";
    }
}
