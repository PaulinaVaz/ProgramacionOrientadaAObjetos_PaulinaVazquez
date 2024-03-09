package edu.paulina_vazquez.reto6.data;

public class Empleado {
    private String nombreDelEmpleado;
    private int horasTrabajadas;
    private int horasExtras;
    private String telefono;
    private String fechaNacimiento;
    private Categoria categoria;

    public Empleado(String nombreDelEmpleado, int horasTrabajadas, int horasExtras, String telefono, String fechaNacimiento, Categoria categoria) {
        this.nombreDelEmpleado = nombreDelEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
    }

    public String getnombreDelEmpleado() {
        return nombreDelEmpleado;
    }

    public void setnombreDelEmpleado(String nombreDelEmpleado) {
        this.nombreDelEmpleado = nombreDelEmpleado;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}