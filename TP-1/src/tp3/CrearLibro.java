package tp3;

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido. Se mantiene el valor anterior.");
        }
    }
}


public class CrearLibro {
    public static void main(String[] args) {
        Libro nuevoLibro = new Libro("Primer libro", "Julian Re", 2024);
        System.out.println(nuevoLibro.getAutor());
        System.out.println(nuevoLibro.getTitulo());
        System.out.println(nuevoLibro.getAnioPublicacion());
    }
}