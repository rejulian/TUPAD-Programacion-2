package poo;

import java.util.UUID;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    private static int totalEmpleados = 0;
    private static int siguienteId = 1;


    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = siguienteId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0;
        totalEmpleados++;
    }


    public void actualizarSalario(double porcentaje){
        if (porcentaje > 0) {
            this.salario += this.salario * (porcentaje / 100.0);
        }
    }

    public void actualizarSalario(int cantidad){
        if (cantidad > 0) {
            this.salario = this.salario + cantidad;
        }
    }

    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + salario + "}";
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
