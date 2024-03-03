package edu.paulina_vazquez.reto5_3.data;

public class Producto {
    private String nombreDelProducto;
    private double precio;
    private int cantidad;
    private double montoPorProducto;

    public Producto(String nombreDelProducto, double precio, int cantidad) {
        this.nombreDelProducto = nombreDelProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.montoPorProducto = precio * cantidad;
    }

    public String getNombreDelProducto() {
        return nombreDelProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getMontoPorProducto() {
        return montoPorProducto;
    }
}
