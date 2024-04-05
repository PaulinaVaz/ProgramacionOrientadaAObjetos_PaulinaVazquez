package edu.paulina_vazquez.reto9.ui;

public abstract class Textos {

    public abstract String bienvenida();
    public abstract String menu();
    public abstract String opcion_invalida();


    public static void escogerIdioma (){
        System.out.println("Elija el idioma");
        System.out.println("Choose the language");
        System.out.println("1. Español");
        System.out.println("2. English");
    }
    public static Textos crearTextos(String idioma){
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
