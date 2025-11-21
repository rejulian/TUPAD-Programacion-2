package tp7.act3;

public class EmpleadoTemporal extends Empleado {
    private final double horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(String nombre, double horas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}