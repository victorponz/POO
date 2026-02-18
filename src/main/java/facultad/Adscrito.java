package facultad;

public class Adscrito {
    private Catedra catedra;
    private Profesor profesor;
    String fecha;

    public Adscrito(Catedra catedra, Profesor profesor, String fecha) {
        this.catedra = catedra;
        this.profesor = profesor;
        this.fecha = fecha;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
