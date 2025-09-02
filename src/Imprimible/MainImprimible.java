package Imprimible;

public class MainImprimible {
    public static void main(String[] args) {
        Imprimible doc = new DocumentoTexto("Este es un texto de ejemplo que debería ocupar varias páginas si es lo suficientemente largo...");
        Imprimible foto = new Foto();

        doc.imprimir();
        foto.imprimir();
    }
}
