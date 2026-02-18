package hospital;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String num;
    private List<Paciente> pacientes = new ArrayList<>();
    public Habitacion(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "num='" + num + '\'' +
                '}';
    }
}
