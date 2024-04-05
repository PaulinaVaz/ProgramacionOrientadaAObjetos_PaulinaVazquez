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
}
