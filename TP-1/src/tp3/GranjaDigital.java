package tp3;

class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " ha puesto un huevo.");
    }

    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ha cumplido un año. Ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " -> Edad: " + edad + " años, Huevos puestos: " + huevosPuestos);
    }
}

public class GranjaDigital {
    public static void main(String[] args) {
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        System.out.println("\nEstado actual de las gallinas:");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
