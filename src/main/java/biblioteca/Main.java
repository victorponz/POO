package biblioteca;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor cervantes = new Autor("Cervantes");
        Tema tema = new Tema("Aventuras");
        Editorial anaya = new Editorial("Anaya");
        Libro quijote =  new Libro("Quijote", tema, anaya);
        // Crea la relación entre autor y libro
        quijote.addAutor(cervantes);
        Lector pepe = new Lector("pepe");
        Ejemplar quijote1 = new Ejemplar("1", quijote, pepe, "hoy");
        Historico h = new Historico(quijote1, pepe, "ayer");

    }
}
