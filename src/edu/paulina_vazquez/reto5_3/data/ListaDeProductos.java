package edu.paulina_vazquez.reto5_3.data;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProductos {
    private List<Producto> productos;
    private double montoTotal;

    public ListaDeProductos() {
        this.productos = new ArrayList<>();
        this.montoTotal = 0.0;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        this.montoTotal += producto.getMontoPorProducto();
    }

    public void eliminarProducto(String nombre) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombreDelProducto().equals(nombre)) {
                Producto eliminado = productos.remove(i);
                this.montoTotal -= eliminado.getMontoPorProducto();
                break;
            }
        }
    }

    public void listarProductosSeleccionados() {
        System.out.println("Lista de Productos Seleccionados:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombreDelProducto() +
                    ", Precio: " + producto.getPrecio() +
                    ", Cantidad: " + producto.getCantidad() +
                    ", Monto por Producto: " + producto.getMontoPorProducto());
        }
    }

    public double calcularMontoTotal() {
        return this.montoTotal;
    }
}
