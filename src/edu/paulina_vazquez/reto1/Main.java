package edu.paulina_vazquez.reto1;

import edu.paulina_vazquez.reto1.ui.CLI;

public class Main {

    /**
     * Esta clase es la encargada activar el menu y,
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
