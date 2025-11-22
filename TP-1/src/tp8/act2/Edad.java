package tp8.act2;

public class Edad {
    public static void main(String[] args) {

        try {
            validarEdad(145);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango permitido.");
        }
        System.out.println("Edad valida!");
    }
}
