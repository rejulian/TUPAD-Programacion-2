package tp2;

import java.util.Scanner;

public class CalculoPrecioFinal {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto (%): ");
        double impuesto = scan.nextDouble() / 100.0;

        System.out.print("Ingrese el porcentaje de descuento (%): ");
        double descuento = scan.nextDouble() / 100.0;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("Precio base: $" + precioBase);
        System.out.println("Impuesto aplicado: " + (impuesto * 100) + "%");
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: $" + precioFinal);

        scan.close();
    }
}
