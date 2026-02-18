package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Ejemplar {
    private String id;
    private Libro libro;
    private Lector lector;
    private String fechaPrestamo;
    private List<Historico> historicos = new ArrayList<>();
    public Ejemplar(String id, Libro libro, Lector lector, String fechaPrestamo) {
        this.id = id;
        this.libro = libro;
        this.libro.getEjemplares().add(this);
        this.lector = lector;
        this.lector.addEjemplar(this);
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;
    }
}
