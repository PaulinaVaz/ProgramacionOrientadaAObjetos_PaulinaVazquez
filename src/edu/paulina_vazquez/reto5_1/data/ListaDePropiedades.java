package edu.paulina_vazquez.reto5_1.data;

import java.util.ArrayList;
import java.util.List;

public class ListaDePropiedades{
    private List<PropiedadVentaRenta> propiedades;

    public ListaDePropiedades() {
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(PropiedadVentaRenta propiedad) {
        this.propiedades.add(propiedad);
    }

    public void mostrarPropiedadesDisponibles() {
        for (PropiedadVentaRenta propiedad : this.propiedades) {
            System.out.println("Tipo: " + propiedad.getTipo() + ", Precio: " + propiedad.getPrecio() +
                    ", Latitud: " + propiedad.getLatitud() + ", Longitud: " + propiedad.getLongitud());
        }
    }
    public List<PropiedadVentaRenta> buscarPropiedadesCercanas(double latitud, double longitud, double radio) {
        List<PropiedadVentaRenta> propiedadesCercanas = new ArrayList<>();
        for (PropiedadVentaRenta propiedad : this.propiedades) {
            double distancia = propiedad.calcularDistancia(latitud, longitud);
            if (distancia <= radio) {
                propiedadesCercanas.add(propiedad);
            }
        }
        return propiedadesCercanas;
    }
}
