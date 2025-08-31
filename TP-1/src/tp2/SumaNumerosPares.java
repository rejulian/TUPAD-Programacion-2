package tp2;

import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int sumaPares = 0;

        System.out.print("Ingrese un número (0 para terminar): ");
        numero = scan.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }

            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scan.nextInt();
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        scan.close();
    }
}
