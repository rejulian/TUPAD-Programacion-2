package tp7.act4;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico");
    }

    public void describirAnimal() {
        System.out.println("Soy " + nombre);
    }
}
