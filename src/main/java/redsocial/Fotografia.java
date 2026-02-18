package redsocial;

public class Fotografia extends Mensaje{
    private String titulo;
    private String fichero;
    Fotografia (String id, Usuario usuario, String fecha, RedSocial redSocial, String titulo, String fichero){
        super(id, usuario, fecha, redSocial);
        this.titulo = titulo;
        this.fichero = fichero;
    }

}

