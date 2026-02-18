package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String nombre;
    private Tema tema;
    private List<Autor> autores = new ArrayList<>();
    private Editorial editorial;
    private List<Ejemplar> ejemplares = new ArrayList<>();
    public Libro(String nombre, Tema tema, Editorial editorial) {
        this.nombre = nombre;
        this.tema = tema;
        // Añadimos este libro a la lista de libros del tema
        this.tema.getLibros().add(this);
        this.editorial = editorial;
        // Añadimos este libro a la lista de libros de la editorial
        this.editorial.getLibros().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public void addAutor(Autor autor){
        this.autores.add(autor);
        autor.getLibros().add(this);
    }
    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }
}
