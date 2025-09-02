package Regulable;

interface Regulable {
    int NIVEL_MIN = 0;
    int NIVEL_MAX = 5;

    void subir();
    void bajar();
    int getNivel();
}

class AireAcondicionado implements Regulable {
    private int nivel;

    public AireAcondicionado(int nivelInicial) {
        if (nivelInicial >= NIVEL_MIN && nivelInicial <= NIVEL_MAX) {
            this.nivel = nivelInicial;
        } else {
            this.nivel = NIVEL_MIN;
        }
    }

    @Override
    public void subir() {
        if (nivel < NIVEL_MAX) {
            nivel++;
        }
        System.out.println("Aire acondicionado nivel: " + nivel);
    }

    @Override
    public void bajar() {
        if (nivel > NIVEL_MIN) {
            nivel--;
        }
        System.out.println("Aire acondicionado nivel: " + nivel);
    }

    @Override
    public int getNivel() {
        return nivel;
    }
}

class Calefactor implements Regulable {
    private int nivel;

    public Calefactor(int nivelInicial) {
        if (nivelInicial >= NIVEL_MIN && nivelInicial <= NIVEL_MAX) {
            this.nivel = nivelInicial;
        } else {
            this.nivel = NIVEL_MIN;
        }
    }

    @Override
    public void subir() {
        if (nivel < NIVEL_MAX) {
            nivel++;
        }
        System.out.println("Calefactor nivel: " + nivel);
    }

    @Override
    public void bajar() {
        if (nivel > NIVEL_MIN) {
            nivel--;
        }
        System.out.println("Calefactor nivel: " + nivel);
    }

    @Override
    public int getNivel() {
        return nivel;
    }
}