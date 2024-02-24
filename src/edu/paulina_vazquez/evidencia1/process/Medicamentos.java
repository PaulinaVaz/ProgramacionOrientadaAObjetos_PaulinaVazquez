package edu.paulina_vazquez.evidencia1.process;

public class Medicamentos {
    private String nombreQuimico;
    private String nombreGenerico;
    private String nombreRegistrado;
    private double precioPublico;
    private double precioVenta;
    private String formaFarmaceutica;

    public String getNombreGenerico()
    {
        return this.nombreGenerico;
    }
    public String getNombreRegistrado()
    {

        return this.nombreRegistrado;
    }
    public double getPrecioVenta()
    {

        return this.precioVenta;
    }
    public double getPrecioPublico()
    {
        return this.precioPublico;
    }

    public Medicamentos(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, double precioVenta, String formaFarmaceutica)
    {
        this.nombreQuimico = nombreQuimico;
        this.nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado;
        this.precioPublico = precioPublico;
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public static double calcularPrecioVenta (double precioPublico, String formaFarmaceutica)
    {
        double porcentajeAdicional;

        switch (formaFarmaceutica.toUpperCase())
        {
            case "SÓLIDA":
                porcentajeAdicional = 0.09;
                break;
            case "SEMISÓLIDA":
                porcentajeAdicional = 0.12;
                break;
            case "LÍQUIDA":
                porcentajeAdicional = 0.13;
                break;
            default:
                porcentajeAdicional = 0;
                System.out.println("No se agregó ningún porcentaje adicional para su precio al público.");
                break;
        }
        return precioPublico * (1 + porcentajeAdicional);
    }
}
