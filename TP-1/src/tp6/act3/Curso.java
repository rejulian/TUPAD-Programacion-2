package tp6.act3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevoProfesor) {
        // Si ya tenía profesor, saco este curso de su lista
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            this.profesor.getCursos().remove(this);
        }

        // Asigno un nuevo profesor
        this.profesor = nuevoProfesor;

        // Si el nuevo profesor no lo tiene en su lista, lo agrego
        if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        System.out.print("Código: " + codigo + " | Nombre: " + nombre);
        if (profesor != null) {
            System.out.println(" | Profesor: " + profesor.getNombre());
        } else {
            System.out.println(" | Profesor: (sin asignar)");
        }
    }

    @Override
    public String toString() {
        return nombre + " [" + codigo + "]";
    }
}