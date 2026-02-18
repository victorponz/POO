package facultad;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private String nombre;
    private List<Departamento> departamentos = new ArrayList<>();

    public AreaConocimiento(String nombre) {
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

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
