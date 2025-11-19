package tp6.act3;

public class Main {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Tecnològica Nacional");

        Profesor p1 = new Profesor("P1", "Julian Re", "Matemática");
        Profesor p2 = new Profesor("P2", "Ivana Gómez", "Programación");
        Profesor p3 = new Profesor("P3", "Ana lopez", "Base de Datos I");

        Curso c1 = new Curso("C1", "Programación I");
        Curso c2 = new Curso("C2", "Programación II");
        Curso c3 = new Curso("C3", "Base de Datos I");
        Curso c4 = new Curso("C4", "Programación III");
        Curso c5 = new Curso("C5", "Estadística I");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P2");
        uni.asignarProfesorACurso("C3", "P3");
        uni.asignarProfesorACurso("C4", "P2");

        uni.listarCursos();
        uni.listarProfesores();

        p2.listarCursos();

        System.out.println("\n=== Cambio de profesor del curso C4 ===");
        c4.setProfesor(p1);
        uni.listarCursos();
        p1.listarCursos();
        p2.listarCursos();

        System.out.println("\n=== Eliminación de curso C3 ===");
        uni.eliminarCurso("C3");
        p3.listarCursos();

        System.out.println("\n=== Eliminación de profesor P1 ===");
        uni.eliminarProfesor("P1");
        uni.listarCursos();

        uni.reporteCursosPorProfesor();
    }
}
