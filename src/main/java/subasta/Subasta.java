package subasta;


import java.util.ArrayList;
import java.util.List;

public class Subasta {

    private String nombre;
    private CasaSubasta casaSubasta;
    private String fecha;
    private List<Lote> lotes = new ArrayList<>();
    public Subasta(String nombre, CasaSubasta casaSubasta, String fecha) {
        this.nombre = nombre;
        this.casaSubasta = casaSubasta;
        this.fecha = fecha;
        this.casaSubasta.getSubastas().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CasaSubasta getCasaSubasta() {
        return casaSubasta;
    }

    public void setCasaSubasta(CasaSubasta casaSubasta) {
        this.casaSubasta = casaSubasta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    @Override
    public String toString() {
        return "Subasta{" +
                "nombre='" + nombre + '\'' +
                ", casaSubasta=" + casaSubasta.getNombre() +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
