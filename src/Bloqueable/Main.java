package Bloqueable;

public class Main {
    public static void main(String[] args) {
        Bloqueable puerta = new Puerta();
        Bloqueable app = new AppMovil();

        puerta.desbloquear();
        System.out.println("Puerta bloqueada: " + puerta.estaBloqueado());

        app.desbloquear();
        System.out.println("App bloqueada: " + app.estaBloqueado());
    }
}