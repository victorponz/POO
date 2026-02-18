package biblioteca;

public class Historico {
    private Ejemplar ejemplar;
    private Lector lector;
    private String fecha;

    public Historico(Ejemplar ejemplar, Lector lector, String fecha) {
        this.ejemplar = ejemplar;
        this.ejemplar.getHistoricos().add(this);
        this.lector = lector;
        this.lector.getHistoricos().add(this);
        this.fecha = fecha;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "ejemplar=" + ejemplar +
                ", lector=" + lector +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
