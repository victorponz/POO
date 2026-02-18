package facultad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private Catedra catedra;
    private AreaConocimiento areaConocimiento;
    private List<Profesor> profesores = new ArrayList<>();
    public Departamento(String nombre, Catedra catedra, AreaConocimiento areaConocimiento) {
        this.nombre = nombre;
        this.catedra = catedra;
        this.catedra.getDepartamentos().add(this);
        this.areaConocimiento = areaConocimiento;
        this.areaConocimiento.getDepartamentos().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString(){
        return this.nombre;
    }


}
