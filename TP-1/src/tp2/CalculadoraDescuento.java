package tp2;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scan.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        char categoria = scan.next().toUpperCase().charAt(0);

        double descuento = 0;

        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoria invalida.");
                scan.close();
                return;
        }

        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);

        scan.close();
    }
}
