import java.util.ArrayList;
import java.util.List;

class Alumno implements Comparable<Alumno>{
    private String nombre; // Campo o atributo
    private String apellido;  // Otro campo
    private int edad;
    private String dni;

    public Alumno(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + " " + this.edad + " " + this.dni;
    }

    @Override
    public int compareTo(Alumno other){
        if (this.apellido.equals(other.apellido)){
            return this.nombre.compareTo(other.nombre);
        }else{
            return this.apellido.compareTo(other.apellido);
        }
    }
}
public class MainAlumno{
    public static void main(String[] args) {
        Alumno pepe = new Alumno("Pepe", "García", 18, "1");
        Alumno pepe2 = new Alumno("Juan", "García", 19, "d");
        List<Alumno> alumnoList = new ArrayList<>();
        alumnoList.add(pepe);
        alumnoList.add(pepe2);
        alumnoList.stream().sorted().forEach(System.out::println);
    }
}
