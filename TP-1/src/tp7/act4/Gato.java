package tp7.act4;

public class Gato extends Animal {
    public Gato() {
        super("Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }
}