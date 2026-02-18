package hospital;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nombre;
    private List<Precribe> prescripciones = new ArrayList<>();
    public Medicamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Precribe> getPrescripciones() {
        return prescripciones;
    }

    public void addPrescripcion(Precribe precribe){
        this.prescripciones.add(precribe);
    }
    @Override
    public String toString() {
        return "Medicamento{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
