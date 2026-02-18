class Persona{
    String nombre; // Campos o atributos
    String apellido;
    int edad;

    // Constructor, puede haber 1 o muchos
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Solo hay un getter por campo
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

    public void cumplirAnyos(){
        this.edad ++;
    }
}

public class MainPersona {

    public static void main(String[] args) {
        Persona pepe = new Persona("Pepe", "García", 12);
        pepe.cumplirAnyos();
        Persona maria = new Persona("María", "Giménez");
        maria.setEdad(30);

        System.out.printf("Maria tiene %d años", maria.getEdad());

    }
}
