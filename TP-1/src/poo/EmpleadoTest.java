package poo;

public class EmpleadoTest {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Julian Re", "Programador");
        Empleado emp2 = new Empleado(100, "Luna Re", "Nutricionista", 90000.0);

        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(3000);

        System.out.println(emp1);
        System.out.println(emp2);

        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}

