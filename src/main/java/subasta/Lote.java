package subasta;

import java.util.ArrayList;
import java.util.List;

public class Lote {

    private int numeroLote;
    private String descripcion;
    private Subasta subasta;
    private List<Articulo> articulos = new ArrayList<>();
    private List<Puja> pujas = new ArrayList<>();
    public Lote(int numeroLote, String descripcion, Subasta subasta) {
        this.numeroLote = numeroLote;
        this.descripcion = descripcion;
        this.subasta = subasta;
        this.subasta.getLotes().add(this);
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }
}
