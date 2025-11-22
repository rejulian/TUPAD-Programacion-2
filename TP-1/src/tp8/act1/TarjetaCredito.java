package tp8.act1;

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando con tarjeta: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }
}
