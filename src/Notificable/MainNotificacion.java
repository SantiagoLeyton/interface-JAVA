package Notificable;

import java.util.Scanner;

public class MainNotificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el destino: ");
        String destino = sc.nextLine();

        System.out.print("Ingrese el mensaje: ");
        String mensaje = sc.nextLine();

        Notificable n;

        n = new SMSNotificacion();
        n.enviar(destino, mensaje);

        n = new EmailNotificacion();
        n.enviar(destino, mensaje);

        sc.close();
    }
}

