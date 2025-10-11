package UML.pasaporte;

public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto;

    public Pasaporte(int numero, String fechaEmision, Titular titular, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = new Foto(imagen, formato);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Pasaporte{" +
                "numero=" + numero +
                ", fechaEmision='" + fechaEmision + '\'' +
                ", titular=" + titular +
                ", foto=" + foto +
                '}';
    }
}
