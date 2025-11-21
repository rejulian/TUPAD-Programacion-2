package tp7.act4;

public class Perro extends Animal {
    public Perro() {
        super("Perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }
}