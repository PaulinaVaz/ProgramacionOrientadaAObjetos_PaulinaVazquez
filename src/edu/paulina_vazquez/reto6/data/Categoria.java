package edu.paulina_vazquez.reto6.data;

public class Categoria {
    private String nombreDeCategoria;
    private String claveDeCategoria;
    private double sueldoBase;
    private double pagoHoraExtra;

    public Categoria(String nombreDeCategoria, String claveDeCategoria, double sueldoBase, double pagoHoraExtra) {
        this.nombreDeCategoria = nombreDeCategoria;
        this.claveDeCategoria = claveDeCategoria;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public String getnombreDeCategoria() {
        return nombreDeCategoria;
    }

    public void setnombreDeCategoria(String nombreDeCategoria) {
        this.nombreDeCategoria = nombreDeCategoria;
    }

    public String getclaveDeCategoria() {
        return claveDeCategoria;
    }

    public void setclaveDeCategoria(String claveDeCategoria) {
        this.claveDeCategoria = claveDeCategoria;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }
}