package Bloqueable;

import java.util.Scanner;

interface Bloqueable {
    void bloquear();
    void desbloquear();
    boolean estaBloqueado();
}

class Puerta implements Bloqueable {
    private boolean bloqueado = true;
    public void bloquear() { bloqueado = true; }
    public void desbloquear() { bloqueado = false; }
    public boolean estaBloqueado() { return bloqueado; }
}

class AppMovil implements Bloqueable {
    private boolean bloqueado = true;
    private final String pin = "1234";
    public void bloquear() { bloqueado = true; }
    public void desbloquear() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese PIN: ");
        String input = sc.nextLine();
        if (input.equals(pin)) bloqueado = false;
    }
    public boolean estaBloqueado() { return bloqueado; }
}