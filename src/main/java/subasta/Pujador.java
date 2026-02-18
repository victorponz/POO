package subasta;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private List<Puja> pujas = new ArrayList<>();
    public Pujador(String nombre) {
        this.nombre = nombre;
    }
    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }
    public String getNombre() {
        return nombre;
    }


}
