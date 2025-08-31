package tp1;

import java.util.Scanner;

public class DivisionEnteros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Resultado de la division: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        input.close();
    }
}
