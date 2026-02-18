package facultad;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private String nombre;
    private Facultad facultad;
    private List<Departamento> departamentos = new ArrayList<>();

    public Catedra(String nombre, Facultad facultad) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.facultad.getCatedras().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
