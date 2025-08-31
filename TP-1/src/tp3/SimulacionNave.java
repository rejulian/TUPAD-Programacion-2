package tp3;

class NaveEspacial {
    String nombre;
    int combustible;
    final int CAPACIDAD_MAX = 100;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > CAPACIDAD_MAX) {
            combustible = CAPACIDAD_MAX;
            System.out.println("El tanque se llenó a su capacidad máxima: " + CAPACIDAD_MAX);
        } else {
            combustible += cantidad;
            System.out.println(nombre + " recargó " + cantidad + " unidades de combustible. Total: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("\nEstado de la nave:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + CAPACIDAD_MAX);
    }
}

public class SimulacionNave {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Nave Re", 50);

        nave.despegar();
        nave.avanzar(30);

        nave.recargarCombustible(60);
        nave.avanzar(20);

        nave.mostrarEstado();
    }
}
