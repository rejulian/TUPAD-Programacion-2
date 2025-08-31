package tp2;

import java.util.Scanner;

public class CompraConEnvio {

    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10;
        } else {
            return 0;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = scan.nextDouble();
        scan.nextLine();

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Total a pagar: $" + total);

        scan.close();
    }
}
