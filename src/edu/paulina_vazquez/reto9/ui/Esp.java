package edu.paulina_vazquez.reto9.ui;

public class Esp extends Textos{

    @Override
    public String bienvenida() {
        return "Bienvenido al contador de palabras.";
    }

    @Override
    public String menu() {
        return "Elija el libro deseado: ";
    }

    @Override
    public String opcion_invalida() {
        return "Opcion invalida, por favor intentelo de nuevo.";
    }

    @Override
    public String palabras_repetidas() {
        return "Las 10 palabras más comunes en el libro ";
    }

    @Override
    public String palabra() {
        return ". Palabra: ";
    }

    @Override
    public String repeticiones() {
        return ", repeticiones: ";
    }

    @Override
    public String error_lectura() {
        return "Error al leer el archivo del libro.";
    }
}
