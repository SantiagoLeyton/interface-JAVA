package Localizable;

import java.util.Scanner;

interface Localizable {
    String ubicacionActual();
    void mover(double lat, double lon);
}

class PaqueteEnvio implements Localizable {
    private double lat;
    private double lon;

    public PaqueteEnvio(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public String ubicacionActual() {
        return "Latitud: " + lat + ", Longitud: " + lon;
    }

    public void mover(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
}

class PerroConChip implements Localizable {
    private double lat;
    private double lon;

    public PerroConChip(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public String ubicacionActual() {
        return "Latitud: " + lat + ", Longitud: " + lon;
    }

    public void mover(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
}
