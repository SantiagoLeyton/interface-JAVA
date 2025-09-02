package Notificable;

import java.util.Scanner;

interface Notificable {
    void enviar(String destino, String mensaje);

    default String formatear(String m) {
        return "[INFO] " + m;
    }
}

class SMSNotificacion implements Notificable {
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando SMS a " + destino + ": " + formatear(mensaje));
    }
}

class EmailNotificacion implements Notificable {
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando Email a " + destino + ": " + formatear(mensaje));
    }
}