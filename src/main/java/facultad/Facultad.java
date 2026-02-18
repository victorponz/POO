package facultad;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private String nombre;
    private List<Catedra> catedras = new ArrayList<>();
    public Facultad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
