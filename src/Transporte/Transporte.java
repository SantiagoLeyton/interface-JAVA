package Transporte;

import java.util.Scanner;

interface Transporte {
    void iniciarViaje(double km);
    double calcularTarifa(double km);
}

class Taxi implements Transporte {
    private double tarifaBase;
    private double tarifaPorKm;

    public Taxi(double tarifaBase, double tarifaPorKm) {
        this.tarifaBase = tarifaBase;
        this.tarifaPorKm = tarifaPorKm;
    }

    @Override
    public void iniciarViaje(double km) {
        double costo = calcularTarifa(km);
        System.out.println("Viaje en taxi iniciado. Distancia: " + km + " km. Tarifa: $" + costo);
    }

    @Override
    public double calcularTarifa(double km) {
        return tarifaBase + (tarifaPorKm * km);
    }
}

class BiciCompartida implements Transporte {
    private double tarifaPorTramo;

    public BiciCompartida(double tarifaPorTramo) {
        this.tarifaPorTramo = tarifaPorTramo;
    }

    @Override
    public void iniciarViaje(double km) {
        double costo = calcularTarifa(km);
        System.out.println("Viaje en bici compartida iniciado. Distancia: " + km + " km. Tarifa: $" + costo);
    }

    @Override
    public double calcularTarifa(double km) {
        int tramos = (int) Math.ceil(km);
        return tarifaPorTramo * tramos;
    }
}