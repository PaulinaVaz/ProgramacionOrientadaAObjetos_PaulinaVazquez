package edu.paulina_vazquez.reto11.ui;

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

    @Override
    public String total_vocales() {
        return "Total vowels in the book: ";
    }

    @Override
    public String palabras_vocales() {
        return "Words that begin with vowels arranged alphabetically: ";
    }

    @Override
    public String longitud_impar() {
        return "Words with odd length: ";
    }

    @Override
    public String palabras_mas_larga() {
        return "Longest word: ";
    }

    @Override
    public String palabras_mas_corta() {
        return "Shortest word:";
    }

    @Override
    public String palabra_caso_especial() {
        return "There is a word with an initial vowel," +
                " a final vowel and a length greater than or equal to 5";
    }
}
