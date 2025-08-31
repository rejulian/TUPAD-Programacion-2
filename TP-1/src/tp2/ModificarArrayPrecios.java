package tp2;

public class ModificarArrayPrecios {
    public static void main(String[] args) {
        double[] precios = {100.0, 250.5, 300.75, 80.0, 150.25};

        System.out.println("Precios originales:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }

        precios[2] = 350.99;

        System.out.println("\nPrecios modificados:");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + (i + 1) + ": $" + precios[i]);
        }
    }
}
