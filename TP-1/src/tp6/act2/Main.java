package tp6.act2;

public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A1", "Stephen King", "Estado unidense");
        Autor a2 = new Autor("A2", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A3", "J. R. R. Tolkien", "Británico");

        biblioteca.agregarLibro("L1", "Secretos", 1967, a1);
        biblioteca.agregarLibro("L2", "Harry Potter", 1997, a2);
        biblioteca.agregarLibro("L3", "El senior de los anillos", 1864, a3);
        biblioteca.agregarLibro("L4", "IT", 1998, a1);
        biblioteca.agregarLibro("L5", "El resplandor", 1985, a1);

        biblioteca.listarLibros();

        System.out.println("\n=== Buscar libro por ISBN ===");
        Libro buscado = biblioteca.buscarLibroPorIsbn("L3");
        if (buscado != null) buscado.mostrarInfo();

        biblioteca.filtrarLibrosPorAnio(1997);

        biblioteca.eliminarLibro("L2");

        System.out.println("\nCantidad total de libros: " + biblioteca.obtenerCantidadLibros());

        biblioteca.mostrarAutoresDisponibles();
    }
}
