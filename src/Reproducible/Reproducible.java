package Reproducible;

interface Reproducible {
    String titulo();
    int duracionSeg();
    void reproducir();
}

class Cancion implements Reproducible {
    private String titulo;
    private int duracion;

    public Cancion(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String titulo() {
        return titulo;
    }

    public int duracionSeg() {
        return duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo canción: " + titulo + " (" + duracion + " seg)");
    }
}

class EpisodioPodcast implements Reproducible {
    private String titulo;
    private int duracion;

    public EpisodioPodcast(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String titulo() {
        return titulo;
    }

    public int duracionSeg() {
        return duracion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + titulo + " (" + duracion + " seg)");
    }
}


