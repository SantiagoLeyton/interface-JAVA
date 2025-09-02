package Pago;

import java.util.Scanner;

interface Pago {
    boolean autorizar(double monto);
    void cobrar(double monto);
    double getSaldo();
}

class TarjetaCredito implements Pago {
    private double saldoDisponible;

    public TarjetaCredito(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autorizar(double monto) {
        return monto <= saldoDisponible;
    }

    @Override
    public void cobrar(double monto) {
        if (autorizar(monto)) {
            saldoDisponible -= monto;
            System.out.println("Pago autorizado con tarjeta. Nuevo saldo: " + saldoDisponible);
        } else {
            System.out.println("Fondos insuficientes en tarjeta.");
        }
    }

    @Override
    public double getSaldo() {
        return saldoDisponible;
    }
}

class BilleteraEfectivo implements Pago {
    private double saldoDisponible;

    public BilleteraEfectivo(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autorizar(double monto) {
        return monto <= saldoDisponible;
    }

    @Override
    public void cobrar(double monto) {
        if (autorizar(monto)) {
            saldoDisponible -= monto;
            System.out.println("Pago autorizado en efectivo. Nuevo saldo: " + saldoDisponible);
        } else {
            System.out.println("No hay suficiente efectivo disponible.");
        }
    }

    @Override
    public double getSaldo() {
        return saldoDisponible;
    }
}