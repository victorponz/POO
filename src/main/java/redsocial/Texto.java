package redsocial;

public class Texto extends Mensaje{
    private String contenido;
    Texto (String id, Usuario usuario, String fecha, RedSocial redSocial, String contenido){
        super(id, usuario, fecha, redSocial);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
