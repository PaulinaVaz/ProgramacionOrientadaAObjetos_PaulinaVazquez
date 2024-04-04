package edu.paulina_vazquez.evidencia2.process;

import edu.paulina_vazquez.evidencia2.data.Costos;

public class Pelicula extends Articulos{
    public Pelicula(String nombre, String tipo, String genero, boolean estreno) {
        super(nombre, tipo, genero, estreno);
    }

    // Implementación del método abstracto para calcular el costo de la película
    @Override
    public double calcularCosto() {
        double costo = Costos.COSTO_BASE;
        if (estreno) {
            costo += Costos.COSTO_ADICIONAL_PELICULAS_ESTRENO;
        } else {
            costo += Costos.COSTO_ADICIONAL_PELICULAS;
        }
        return costo;
    }
}
