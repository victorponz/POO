package subasta;

public class Puja {
    private Pujador pujador;
    private Lote lote;
    private double cantidad;

    public Puja(Pujador pujador, Lote lote, double cantidad) {
        this.pujador = pujador;
        this.lote = lote;
        this.cantidad = cantidad;
        this.pujador.addPuja(this);
        this.lote.getPujas().add(this);
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
