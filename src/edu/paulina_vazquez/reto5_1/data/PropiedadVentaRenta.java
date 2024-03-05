package edu.paulina_vazquez.reto5_1.data;

public class PropiedadVentaRenta {
    private String tipo;
    private double latitud;
    private double longitud;
    private double precio;

    public void PropiedadVentaRenta(String tipo, double latitud, double longitud, double precio) {
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.precio = precio;
    }
    public double calcularDistancia(double latitudDestino, double longitudDestino) {

        final double RADIO_TIERRA = 6371; // Radio de la Tierra en kilómetros
        double dLatitud = Math.toRadians(latitudDestino - this.latitud);
        double dLongitud = Math.toRadians(longitudDestino - this.longitud);
        double a = Math.sin(dLatitud / 2) * Math.sin(dLatitud / 2) +
                Math.cos(Math.toRadians(this.latitud)) * Math.cos(Math.toRadians(latitudDestino)) *
                        Math.sin(dLongitud / 2) * Math.sin(dLongitud / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distancia = RADIO_TIERRA * c;
        return distancia;
    }

    public String getTipo() {
        return null;
    }

    public String getLatitud() {
        return null;
    }

    public String getLongitud() {
        return null;
    }

    public String getPrecio() {
        return null;
    }
}