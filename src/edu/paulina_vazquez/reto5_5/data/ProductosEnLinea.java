package edu.paulina_vazquez.reto5_5.data;

public class ProductosEnLinea {
    private String articuloSeleccionado;
    private int cantidadDeseada;
    private double precioUnitario;
    private double IVA;
    private double montoNeto;

    public ProductosEnLinea(String articuloSeleccionado, int cantidadDeseada, double precioUnitario, double IVA) {
        this.articuloSeleccionado = articuloSeleccionado;
        this.cantidadDeseada = cantidadDeseada;
        this.precioUnitario = precioUnitario;
        this.IVA = IVA;
        calcularMontoNeto();
    }

    public String getArticuloSeleccionado() {
        return articuloSeleccionado;
    }

    public int getCantidadDeseada() {
        return cantidadDeseada;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getIVA() {
        return IVA;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    private void calcularMontoNeto() {
        double subtotal = cantidadDeseada * precioUnitario;
        double montoIVA = subtotal * (IVA / 100);
        this.montoNeto = subtotal + montoIVA;
    }
}
