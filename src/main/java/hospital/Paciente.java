package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private Habitacion habitacion;
    private List<Intervencion> intervenciones = new ArrayList<>();
    public Paciente(String nombre, Habitacion habitacion) {
        this.nombre = nombre;
        this.habitacion = habitacion;
        habitacion.getPacientes().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
