package redsocial;

public class Comentario {
    private Usuario usuario;
    private String texto;
    private Mensaje mensaje;

    public Comentario(Usuario usuario, String texto, Mensaje mensaje) {
        this.usuario = usuario;
        this.texto = texto;
        this.mensaje = mensaje;
        this.mensaje.getComentarios().add(this);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
}
