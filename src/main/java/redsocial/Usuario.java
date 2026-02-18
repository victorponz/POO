package redsocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private RedSocial resSocial;
    private final List<Mensaje> mensajes = new ArrayList<>();
    public Usuario(String nombre, RedSocial resSocial) {
        this.nombre = nombre;
        this.resSocial = resSocial;
        // Como la red social tiene una lista de usuarios, hay que añadirlo a ella
        this.resSocial.getUsuarios().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RedSocial getResSocial() {
        return resSocial;
    }

    public void setResSocial(RedSocial resSocial) {
        this.resSocial = resSocial;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }
}
