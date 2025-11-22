package tp8.act1;

public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " recibió notificación: " + mensaje);
    }
}