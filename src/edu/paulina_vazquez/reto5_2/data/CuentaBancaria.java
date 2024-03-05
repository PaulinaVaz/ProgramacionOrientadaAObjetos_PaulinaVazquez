package edu.paulina_vazquez.reto5_2.data;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double mostrarSaldo() {
        return this.saldo;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        this.saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}
