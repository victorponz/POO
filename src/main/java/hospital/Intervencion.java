package hospital;

import java.util.ArrayList;
import java.util.List;

public class Intervencion {
    private Medico medico;
    private Paciente paciente;
    private List<Precribe> prescripciones = new ArrayList<>();
    public Intervencion(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.medico.getIntervenciones().add(this);
        this.paciente = paciente;
        this.paciente.getIntervenciones().add(this);
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Precribe> getPrescripciones() {
        return prescripciones;
    }

    public void addPrescripcion(Precribe precribe){
        this.prescripciones.add(precribe);
    }

    @Override
    public String toString() {
        return "Intervencion{" +
                "medico=" + medico +
                ", paciente=" + paciente +
                '}';
    }
}
