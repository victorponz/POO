package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();
    public Tema(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}
