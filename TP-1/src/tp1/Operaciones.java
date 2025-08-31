package tp1;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = input.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: No se puede dividir entre cero");
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        input.close();
    }
}
