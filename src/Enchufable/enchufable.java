package Enchufable;

interface Enchufable {
    void Encender();
    void Apagar();
    default boolean EstaEncendido(boolean estado) {
        return estado;
    };
}

class Lampara implements Enchufable {

    boolean estado = false;

    @Override
    public void Encender() {
        if (estado) {
            System.out.println("La lampara ya estaba encendida");
        }
        else {
            System.out.println("La lampara se encendió correctamente");
            EstaEncendido(true);
        }
    }

    @Override
    public void Apagar() {
        if (!estado) {
            System.out.println(("La lampara no esta encendida!"));
        } else {
            System.out.println(("La lampara se apagó correctamente"));
            EstaEncendido(false);
        }
    }
}

class Ventilador implements Enchufable {

    boolean estado = false;

    @Override
    public void Encender() {
        if (estado) {
            System.out.println("El ventilador ya estaba encendido");
        }
        else {
            System.out.println("El ventilador se encendió correctamente");
            EstaEncendido(true);
        }
    }

    @Override
    public void Apagar() {
        if (!estado) {
            System.out.println(("El ventilador no esta encendido!"));
        } else {
            System.out.println(("El ventilador se apagó correctamente"));
            EstaEncendido(false);
        }
    }
}
