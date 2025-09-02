package Imprimible;

interface Imprimible {
    int paginas();
    void imprimir();
}

class DocumentoTexto implements Imprimible {
    private String contenido;

    public DocumentoTexto(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public int paginas() {
        return (int) Math.ceil((double) contenido.length() / 800);
    }

    @Override
    public void imprimir() {
        System.out.println("Documento de texto - Páginas estimadas: " + paginas());
    }
}

class Foto implements Imprimible {
    @Override
    public int paginas() {
        return 1;
    }

    @Override
    public void imprimir() {
        System.out.println("Foto - Páginas estimadas: " + paginas());
    }
}
