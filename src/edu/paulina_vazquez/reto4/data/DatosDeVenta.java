package edu.paulina_vazquez.reto4.data;

import java.util.ArrayList;

public class DatosDeVenta {
    private String nombreDelComprador;
    private int cantidadDePasajeros;
    private ArrayList <String> pasajerosAdicionales  ;

    public void recopilarDatosDeVenta (String nombreDelComprador, int cantidadDePasajeros){
        this.nombreDelComprador = nombreDelComprador;
        this.cantidadDePasajeros = cantidadDePasajeros;
        this.pasajerosAdicionales = new ArrayList<>();
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
    public boolean agregarPasajeroAdicional(String nombrePasajero){
        return pasajerosAdicionales.add(nombrePasajero);
    }
    public double calcularImporte(){
        return cantidadDePasajeros;
    }
}
