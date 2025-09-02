package Transporte;

import java.util.Scanner;

    public class MainTransporte {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Transporte taxi = new Taxi(3000, 1200);
            Transporte bici = new BiciCompartida(800);

            System.out.print("Ingrese la distancia del viaje en km: ");
            double km = sc.nextDouble();

            System.out.print("Ingrese el tipo de transporte (taxi/bici): ");
            String tipo = sc.next();

            Transporte t;

            if (tipo.equalsIgnoreCase("taxi")) {
                t = taxi;
            } else {
                t = bici;
            }

            t.iniciarViaje(km);

            System.out.println("\n--- Demostración de polimorfismo ---");
            t = taxi;
            t.iniciarViaje(km);
            t = bici;
            t.iniciarViaje(km);

            sc.close();
        }
    }