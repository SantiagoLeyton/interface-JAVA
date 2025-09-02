package Enchufable;

import java.util.Scanner;

interface Enchufable {
    void encender();
    void apagar();
    boolean estaEncendido();
}

class Lampara implements Enchufable {
    private boolean encendido = false;
    public void encender() {
        encendido = true;
        System.out.println("Lámpara encendida");
    }
    public void apagar() {
        encendido = false;
        System.out.println("Lámpara apagada");
    }
    public boolean estaEncendido() { return encendido; }
}

class Ventilador implements Enchufable {
    private boolean encendido = false;
    public void encender() {
        encendido = true;
        System.out.println("Ventilador encendido");
    }
    public void apagar() {
        encendido = false;
        System.out.println("Ventilador apagado");
    }
    public boolean estaEncendido() { return encendido; }
}