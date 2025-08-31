import java.util.Scanner;

public class DivisonDecimales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer numero (double): ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo numero (double): ");
        double num2 = input.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado de la division: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        input.close();
    }
}
