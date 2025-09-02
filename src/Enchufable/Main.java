package Enchufable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ventilador v = new Ventilador();
        Lampara l = new Lampara();
        Scanner sc = new Scanner(System.in);
        boolean bucle = true;

        while (bucle) {
            System.out.println("¿Qué deseas usar esta vez?");
            System.out.println("1. Ventilador");
            System.out.println("2. Lámpara");
            System.out.println("3. Salir");
            System.out.print("Ingresa tu opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("¿Qué deseas hacer?");
                System.out.println("1. Encender");
                System.out.println("2. Apagar");
                System.out.print("Ingresa tu opción: ");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        v.Encender();
                        break;
                    case 2:
                        v.Apagar();
                        break;
                    default:
                        System.out.println("¡Coloca una opción válida!");
                }

            } else if (opcion == 2) {
                System.out.println("¿Qué deseas hacer?");
                System.out.println("1. Encender");
                System.out.println("2. Apagar");
                System.out.print("Ingresa tu opción: ");

                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        l.Encender();
                        break;
                    case 2:
                        l.Apagar();
                        break;
                    default:
                        System.out.println("¡Coloca una opción válida!");
                }

            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema...");
                bucle = false;

            } else {
                System.out.println("¡Ingrese una opción válida!");
            }
        }

        sc.close();
        System.out.println("¡Programa finalizado!");
    }
}