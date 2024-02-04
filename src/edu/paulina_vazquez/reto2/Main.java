package edu.paulina_vazquez.reto2;

import edu.paulina_vazquez.reto1.ui.CLI;

public class Main {
    public static void main(String[] arg) {
        try{
            CLI.showMenu();
        }catch (Exception e){
            System.out.println("Error inesperado " + e);
        }
    }
}
