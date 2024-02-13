package edu.paulina_vazquez.reto3;

import edu.paulina_vazquez.reto3.process.DiccionarioDePalabras;
import edu.paulina_vazquez.reto3.ui.CLI;

public class Main {
    /**
     * Es la encargada activar los programas y, guardar los arreglos de
     * palabras y significados ademas, de atrapar los errores y mostar un
     * mensaje ante esta situacion.
     */
    public static void main(String[] arg) {
        String[] palabras = {"musica","piano","cancion","violin","guitarra","tambor",
        "trompeta","flauta", "instrumento","voz"};
        String[] significados = {"Combinación ordenada de ritmo, melodía y armonía.",
            "Es un instrumento musical de cuerda percutida.","Composición musical que posee " +
            "una melodía.","Instrumento musical de cuerda, el más pequeño y agudo entre los de " +
            "su clase.", "Instrumento musical de cuerda compuesto por una caja de resonancia.",
            "Instrumento musical de percusión.", " Instrumento musical de viento.","Instrumento " +
            "musical  en forma de tubo", "Objeto fabricado con el que se puede realizar una " +
            "actividad.", "Sonido producido por la vibración de las cuerdas vocales."};
        DiccionarioDePalabras diccionarioDePalabras = new DiccionarioDePalabras(significados, palabras);

        try{
            CLI.launchApp();
        }catch (Exception e){
            System.out.println("Error inesperado " + e);
        }
    }
}