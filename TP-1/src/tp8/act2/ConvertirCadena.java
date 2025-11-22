package tp8.act2;

import java.util.Scanner;

public class ConvertirCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese numero: ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.println("Número: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no es un número válido.");
        }
    }
}
