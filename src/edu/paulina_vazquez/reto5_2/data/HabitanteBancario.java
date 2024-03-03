package edu.paulina_vazquez.reto5_2.data;

import java.util.ArrayList;
import java.util.List;

public class HabitanteBancario {
    private String nombre;
    private List<CuentaBancaria> cuentas;

    public void HabitanteDeBanco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public void crearCuentaNueva(double saldoInicial) {
        CuentaBancaria nuevaCuenta = new CuentaBancaria(saldoInicial);
        this.cuentas.add(nuevaCuenta);
        System.out.println("Se ha creado una nueva cuenta para " + this.nombre);
    }

    public void mostrarCuentas() {
        System.out.println("Cuentas de " + this.nombre + ":");
        for (CuentaBancaria cuenta : cuentas) {
            System.out.println("Saldo: " + cuenta.mostrarSaldo());
        }
    }

    public void realizarTransferencia(CuentaBancaria destino, double monto) {
        // Verificar si el saldo es suficiente para realizar la transferencia
        if (this.cuentas.get(0).getSaldo() >= monto) {
            this.cuentas.get(0).retirar(monto);
            destino.depositar(monto);
            System.out.println("Se ha realizado una transferencia de " + monto + " a la cuenta de destino.");
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }
}


