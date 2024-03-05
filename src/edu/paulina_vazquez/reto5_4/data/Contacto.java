package edu.paulina_vazquez.reto5_4.data;

public class Contacto {
    private String nombreDelContacto;
    private String direccion;
    private String telefonoDeCasa;
    private String telefonoDeTrabajo;

    public Contacto(String nombreDelContacto, String direccion, String telefonoDeCasa, String telefonoDeTrabajo) {
        this.nombreDelContacto = nombreDelContacto;
        this.direccion = direccion;
        this.telefonoDeCasa = telefonoDeCasa;
        this.telefonoDeTrabajo = telefonoDeTrabajo;
    }

    public String getNombreDelContacto() {
        return nombreDelContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefonoDeCasa() {
        return telefonoDeCasa;
    }

    public String getTelefonoDeTrabajo() {
        return telefonoDeTrabajo;
    }
}
