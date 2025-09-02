package Regulable;

public class MainRegulable {
    public static void main(String[] args) {
        Regulable aire = new AireAcondicionado(2);
        Regulable calefactor = new Calefactor(3);

        aire.subir();
        aire.bajar();
        calefactor.subir();
        calefactor.bajar();
    }
}
