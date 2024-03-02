package edu.paulina_vazquez.evidencia1;

import edu.paulina_vazquez.evidencia1.ui.CLI;

/**
 * Esta clase incia la aplicación llamando al método main() de la clase CLI, que a su vez inicia la
 * interfaz de línea de comandos para el ingreso de datos de los medicamentos.
 **/

public class Main {
    public static void main(String[] args)
    {
        try
        {
            CLI.main(args);
        }
        catch (Exception e)
        {
            System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
        }
    }

}
