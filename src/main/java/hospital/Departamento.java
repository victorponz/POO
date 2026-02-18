package hospital;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private Hospital hospital;
    private List<Medico> medicos = new ArrayList<>();
    public Departamento(String nombre, Hospital hospital) {
        this.nombre = nombre;
        this.hospital = hospital;
        this.hospital.getDepartamentos().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void addMedico(Medico medico){
        this.medicos.add(medico);
        medico.getDepartamentos().add(this);
    }
    @Override
    public String toString() {
        return "Departamento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
