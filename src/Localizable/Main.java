package Localizable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Localizable paquete = new PaqueteEnvio(0, 0);
        Localizable perro = new PerroConChip(0, 0);

        System.out.println("1. Mover paquete\n2. Mover perro\n3. Ver ubicación paquete\n4. Ver ubicación perro\n5. Salir");

        int opcion;
        do {
            System.out.print("Elija opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Nueva latitud: ");
                    double latPaq = sc.nextDouble();
                    System.out.print("Nueva longitud: ");
                    double lonPaq = sc.nextDouble();
                    paquete.mover(latPaq, lonPaq);
                    break;
                case 2:
                    System.out.print("Nueva latitud: ");
                    double latPerro = sc.nextDouble();
                    System.out.print("Nueva longitud: ");
                    double lonPerro = sc.nextDouble();
                    perro.mover(latPerro, lonPerro);
                    break;
                case 3:
                    System.out.println("Ubicación paquete: " + paquete.ubicacionActual());
                    break;
                case 4:
                    System.out.println("Ubicación perro: " + perro.ubicacionActual());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
        sc.close();
    }
}
