package edu.paulina_vazquez.reto4.data;

import java.util.ArrayList;

/**
 * Esta tiene la funcion de almacenar todos los datos para
 * el funcionamiento de VentasDeBoleto, se declaran las
 * variables necesarias y se almacenan.
 */

public class DatosDeVenta {
    /**
     * El usuario da los nombres necesarios y la cantidad
     * de boletos para calcular el importe y generar una
     * lista con los datos que se almacena.
     */
    public String nombreDelComprador;
    public int cantidadDePasajeros;
    public ArrayList<String> pasajerosAdicionales;
    public static final double costoDeBoleto = 1250.50;

    public void listarDatosDeVenta(String nombreDelComprador, int cantidadDePasajeros) {
        this.nombreDelComprador = nombreDelComprador;
        this.cantidadDePasajeros = cantidadDePasajeros;
        this.pasajerosAdicionales = new ArrayList<>();
    }

    public double calcularImporte() {
        return cantidadDePasajeros * costoDeBoleto;
    }

    public void agregarPasajeroAdicional(String nombrePasajero) {
        pasajerosAdicionales.add(nombrePasajero);
    }

    public String getNombreDelComprador() {
        return nombreDelComprador;
    }

    public int getCantidadDePasajeros() {
        return cantidadDePasajeros;
    }

    public ArrayList<String> getPasajerosAdicionales() {
        return pasajerosAdicionales;
    }
}