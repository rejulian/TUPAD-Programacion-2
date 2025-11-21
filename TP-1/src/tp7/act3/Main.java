package tp7.act3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Julian", 2000));
        empleados.add(new EmpleadoTemporal("Luna", 140, 15));

        for (Empleado e : empleados) {
            e.mostrarSueldo();
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es empleado de planta");
            } else {
                System.out.println("Es empleado temporal");
            }
        }
    }
}
