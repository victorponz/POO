package hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("General");
        Departamento cirugia = new Departamento("Cirugía", hospital);
        Habitacion hab1 = new Habitacion( "1");
        Paciente pepe = new Paciente("pepe", hab1);
        Medico med1 = new Medico("Juan");
        Medico med2 = new Medico("María");
        cirugia.addMedico(med1);
        cirugia.addMedico(med2);
        Intervencion intervencion = new Intervencion(med1, pepe);
        Medicamento aspirina = new Medicamento("Aspirina");
        Precribe pres = new Precribe(aspirina, intervencion, "100");
        intervencion.getPrescripciones().forEach(System.out::println);
    }
}
