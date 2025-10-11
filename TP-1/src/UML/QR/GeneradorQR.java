package UML.QR;

public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR codigo = new CodigoQR(valor, usuario);
        return codigo;
    }
}
