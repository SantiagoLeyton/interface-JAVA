package Reproducible;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Reproducible> cola = new ArrayList<>();

        cola.add(new Cancion("Bohemian Rhapsody", 355));
        cola.add(new EpisodioPodcast("Tecnología Hoy - Episodio 10", 1800));
        cola.add(new Cancion("Imagine", 200));
        cola.add(new EpisodioPodcast("Historia Universal - Roma", 2400));

        int duracionTotal = 0;

        for (Reproducible item : cola) {
            item.reproducir();
            duracionTotal += item.duracionSeg();
        }

        System.out.println("Duración total de la lista: " + duracionTotal + " seg");
    }
}

