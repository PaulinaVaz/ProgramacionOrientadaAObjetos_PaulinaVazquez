package edu.paulina_vazquez.reto6.process;

import edu.paulina_vazquez.reto6.data.Empleado;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeNomina {

    /**
     * Esta clase se encarga de calcular la nomina de los empleados
     * asi como la cantidad de personas que trabajaron horas extras
     * y las que no.
     */
    private List<Empleado> empleados;


    public CalculadoraDeNomina() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado, int i) {
        empleados.add(empleado);
    }

    public double calcularTotalNomina() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
            total += empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
        }
        return total;
    }

    public double calcularTotalSueldoNormal() {
        double totalSueldoNormal = 0;
        for (Empleado empleado : empleados) {
            totalSueldoNormal += empleado.getCategoria().getSueldoBase() * empleado.getHorasTrabajadas();
        }
        return totalSueldoNormal;
    }

    public double calcularTotalPagoHorasExtras() {
        double totalPagoHorasExtras = 0;
        for (Empleado empleado : empleados) {
            totalPagoHorasExtras += empleado.getCategoria().getPagoHoraExtra() * empleado.getHorasExtras();
        }
        return totalPagoHorasExtras;
    }

    public int calcularTotalHorasLaboradas() {
        int totalHorasLaboradas = 0;
        for (Empleado empleado : empleados) {
            totalHorasLaboradas += empleado.getHorasTrabajadas() + empleado.getHorasExtras();
        }
        return totalHorasLaboradas;
    }

    public int contarPersonasConHorasExtras() {
        int contador = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getHorasExtras() > 0) {
                contador++;
            }
        }
        return contador;
    }

    public int contarPersonasSinHorasExtras() {
        int contador = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getHorasExtras() == 0) {
                contador++;
            }
        }
        return contador;
    }
}