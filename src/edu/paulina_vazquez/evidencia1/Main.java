package edu.paulina_vazquez.evidencia1;

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
