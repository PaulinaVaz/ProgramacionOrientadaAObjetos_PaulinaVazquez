package edu.paulina_vazquez.reto4;

import edu.paulina_vazquez.reto4.process.VentasDeBoleto;
import edu.paulina_vazquez.reto4.ui.CLI;

public class Main {
    /**
     * Es la encargada activar el menu y,
     * ademas, de atrapar los errores y mostar un
     * mensaje ante esta situacion. Tambien
     * declara las ventas de boleto.
     */
    static VentasDeBoleto ventasDeBoleto = new VentasDeBoleto();
    public static void main(String[] arg) {
        try{
            CLI.showMenu(ventasDeBoleto);
        }catch (Exception e){
            System.out.println("Error inesperado " + e);
        }
    }
}
