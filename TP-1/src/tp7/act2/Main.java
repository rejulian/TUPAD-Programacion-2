package tp7.act2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(12));
        figuras.add(new Rectangulo(3, 5));

        for (Figura f : figuras) {
            f.mostrarArea();
        }
    }
}
