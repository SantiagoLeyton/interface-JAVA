package Pago;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pago tarjeta = new TarjetaCredito(500);
        Pago efectivo = new BilleteraEfectivo(300);

        System.out.print("Ingrese monto a pagar: ");
        double monto = sc.nextDouble();

        System.out.print("Ingrese tipo de pago");
        System.out.print("1. Tarjeta de crédito");
        System.out.print("2. Efectivo");
        System.out.print("Seleccione una opción");
        int tipo = sc.nextInt();

        Pago p;

        if (tipo == 1) {
            p = tarjeta;
        } else {
            p = efectivo;
        }

        p.cobrar(monto);

        tarjeta.cobrar(monto);
        efectivo.cobrar(monto);

        sc.close();
    }
}

