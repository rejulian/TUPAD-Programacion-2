package tp3;

class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInformacion() {
        System.out.println("-----------------------------");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
        System.out.println("-----------------------------");
    }
}

public class RegistroEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", "García", "Matemáticas", 8.5);
        Estudiante e2 = new Estudiante("Luis", "Pérez", "Historia", 7.0);

        e1.mostrarInformacion();
        e2.mostrarInformacion();
    }
}
