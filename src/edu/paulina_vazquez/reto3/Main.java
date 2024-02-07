package edu.paulina_vazquez.reto3;

import edu.paulina_vazquez.reto3.ui.CLI;

public class Main {
    /**
     * Es la encargada activar el menu y,
     * ademas, de atrapar los errores y mostar un
     * mensaje ante esta situacion.
     */
    public static void main(String[] arg) {
        try{
            CLI.showMenu();
        }catch (Exception e){
            System.out.println("Error inesperado " + e);
        }
    }
}