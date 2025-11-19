package tp6.act1;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("ABC123", "Pan", 500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("DEF456", "Celular", 150000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("GHI789", "Camisa", 2500, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("JKL123", "Silla", 8000, 10, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("MNO456", "Galletas", 1200, 50, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("=== Listado de Productos ===");
        inventario.listarProductos();

        System.out.println("\n=== Buscar Producto por ID ===");
        Producto buscado = inventario.buscarProductoPorId("R1");
        if (buscado != null) buscado.mostrarInfo();

        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        inventario.eliminarProducto("DEF456");

        inventario.actualizarStock("MNO456", 80);

        System.out.println("\nTotal de unidades en stock: " + inventario.obtenerTotalStock());

        Producto mayor = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock: " + mayor);

        inventario.filtrarProductosPorPrecio(1000, 3000);
        inventario.mostrarCategoriasDisponibles();
    }
}
