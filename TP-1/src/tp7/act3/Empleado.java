package tp7.act3;

public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSueldo();

    public void mostrarSueldo() {
        System.out.println(nombre + " cobra: $" + calcularSueldo());
    }
}
