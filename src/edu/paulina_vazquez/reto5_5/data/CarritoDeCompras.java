package edu.paulina_vazquez.reto5_5.data;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List<ProductosEnLinea> listaDeArticulos;

    public CarritoDeCompras() {
        this.listaDeArticulos = new ArrayList<>();
    }

    public void agregarArticulo(ProductosEnLinea producto) {
        this.listaDeArticulos.add(producto);
    }

    public void eliminarArticulo(String nombreArticulo) {
        for (int i = 0; i < listaDeArticulos.size(); i++) {
            if (listaDeArticulos.get(i).getArticuloSeleccionado().equals(nombreArticulo)) {
                listaDeArticulos.remove(i);
                break;
            }
        }
    }

    public ProductosEnLinea buscarArticulo(String nombreArticulo) {
        for (ProductosEnLinea producto : listaDeArticulos) {
            if (producto.getArticuloSeleccionado().equals(nombreArticulo)) {
                return producto;
            }
        }
        return null;
    }

    public double calcularMontoTotal() {
        double montoTotal = 0.0;
        for (ProductosEnLinea producto : listaDeArticulos) {
            montoTotal += producto.getMontoNeto();
        }
        return montoTotal;
    }
}
