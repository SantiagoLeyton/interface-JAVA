package Enchufable;

interface Enchufable {
    void encender();
    void apagar();
    boolean estaEncendido();
}

class Lampara implements Enchufable {
    private boolean encendido = false;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Lámpara encendida");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Lámpara apagada");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}


class Ventilador implements Enchufable {
    private boolean encendido = false;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Ventilador encendido");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Ventilador apagado");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}