package tp2;

public class RecursividadArrayPrecios {

    public static void imprimirArray(double[] arr, int indice) {
        if (indice == arr.length) {
            return;
        }
        System.out.println("Producto " + (indice + 1) + ": $" + arr[indice]);
        imprimirArray(arr, indice + 1);
    }

    public static void main(String[] args) {
        double[] precios = {100.0, 250.5, 300.75, 80.0, 150.25};

        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        precios[2] = 350.99;

        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }
}
