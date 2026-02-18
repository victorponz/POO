package hospital;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private List<Departamento> departamentos = new ArrayList<>();
    private List<Intervencion> intervenciones = new ArrayList<>();
    public Medico(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
        departamento.getMedicos().add(this);
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
