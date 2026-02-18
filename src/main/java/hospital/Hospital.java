package hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private List<Departamento> departamentos = new ArrayList<>();
    public Hospital(String nombre) {
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

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
