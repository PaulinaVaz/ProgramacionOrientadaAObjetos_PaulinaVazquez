package edu.paulina_vazquez.evidencia2.process;

import edu.paulina_vazquez.evidencia2.data.Costos;

import java.util.Collections;

import static edu.paulina_vazquez.evidencia2.data.GeneradorArticulos.generos;

public class Libro extends Articulos{

    public Libro(String nombre, String tipo, String genero, boolean estreno) {

        super(nombre, tipo, genero, estreno);
    }

    @Override
    public double calcularCosto() {
        double costo = Costos.COSTO_BASE;
        switch (generos){
            case Collections.singletonList("novela"):
                costo = costo + Costos.COSTO_ADICIONAL_NOVELAS;
                break;
            case Collections.singletonList("tecnologia"):
                costo = costo + Costos.COSTO_ADICIONAL_LIBROS_TECNOLOGIA;
                break;
        }
        if (estreno) {
           costo =+ Costos.COSTO_ADICIONAL_LIBROS_ESTRENO;
        }
        return costo;
    }
}
