package tp3;

class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("-----------------------------");
    }

    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años.");
    }
}

public class RegistroMascota {
    public static void main(String[] args) {
        // Crear una mascota
        Mascota m1 = new Mascota("Firulais", "Perro", 3);

        // Mostrar su información inicial
        System.out.println("Información inicial de la mascota:");
        m1.mostrarInfo();

        // Simular el paso del tiempo
        System.out.println("Simulando que pasa un año...");
        m1.cumplirAnios();

        // Mostrar la información actualizada
        System.out.println("Información después de un año:");
        m1.mostrarInfo();
    }
}
