package tp6.act2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro agregado: " + titulo);
    }

    public void listarLibros() {
        System.out.println("\n=== Libros en la biblioteca \"" + nombre + "\" ===");
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.remove(l);
            System.out.println("Libro eliminado: " + l.getTitulo());
        } else {
            System.out.println("No se encontró el libro con ISBN " + isbn);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\nLibros publicados en el año " + anio + ":");
        boolean encontrado = false;
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No hay libros publicados en ese año.");
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\nAutores disponibles en la biblioteca:");
        ArrayList<String> nombresAutores = new ArrayList<>();
        for (Libro l : libros) {
            String nombreAutor = l.getAutor().getNombre();
            if (!nombresAutores.contains(nombreAutor)) {
                nombresAutores.add(nombreAutor);
                l.getAutor().mostrarInfo();
            }
        }
    }
}
