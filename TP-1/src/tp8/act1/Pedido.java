package tp8.act1;

import java.util.ArrayList;

public class Pedido implements Pagable{
    private ArrayList<Producto> productos;
    private Notificable cliente;
    private String estado;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void cambiarEstado(String estado){
        this.estado = estado;
        cliente.notificar("Nuevo estado de pedido: " + estado);
    }
}
