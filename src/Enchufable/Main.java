package Enchufable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué desea encender (lampara/ventilador)? ");
        String opcion = sc.nextLine();
        Enchufable e;
        if (opcion.equalsIgnoreCase("lampara")) {
            e = new Lampara();
        } else {
            e = new Ventilador();
        }
        e.encender();
        System.out.println("¿Está encendido? " + e.estaEncendido());
        e.apagar();
        System.out.println("¿Está encendido? " + e.estaEncendido());
    }
}
