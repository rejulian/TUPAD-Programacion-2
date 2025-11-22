package tp8.act1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("julian");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("iPhone 15", 800.0));
        pedido.agregarProducto(new Producto("MacBook m4", 2000.0));

        System.out.println("total: " + pedido.calcularTotal());

        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());

        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Enviado");
    }
}
