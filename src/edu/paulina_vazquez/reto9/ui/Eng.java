package edu.paulina_vazquez.reto9.ui;

public class Eng extends Textos{

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
}
