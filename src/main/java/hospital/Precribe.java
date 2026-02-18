package hospital;

import java.util.List;

public class Precribe {
    private Medicamento medicamento;
    private Intervencion intervencion;
    private String dosis;

    public Precribe(Medicamento medicamento, Intervencion intervencion, String dosis) {
        this.medicamento = medicamento;
        this.medicamento.addPrescripcion(this);
        this.intervencion = intervencion;
        this.intervencion.addPrescripcion(this);
        this.dosis = dosis;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return "Precribe{" +
                "medicamento=" + medicamento +
                ", intervencion=" + intervencion +
                ", dosis='" + dosis + '\'' +
                '}';
    }
}
