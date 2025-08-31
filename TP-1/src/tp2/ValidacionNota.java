package tp2;

import java.util.Scanner;

public class ValidacionNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = scan.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida ingresada: " + nota);

        scan.close();
    }
}
