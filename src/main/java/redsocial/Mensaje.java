package redsocial;

import java.util.ArrayList;
import java.util.List;

public abstract class Mensaje {
    private String id;
    private Usuario usuario;
    private String fecha;
    private RedSocial redSocial;
    private int likes;
    private List<Comentario> comentarios = new ArrayList<>();

    public Mensaje(String id, Usuario usuario, String fecha, RedSocial redSocial) {
        this.id = id;
        this.usuario = usuario;
        // Es una relación 1:N por lo que añado este mensaje a la lista de mensajes del usuario
        this.usuario.getMensajes().add(this);
        this.fecha = fecha;
        this.redSocial = redSocial;
        this.likes = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public RedSocial getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(RedSocial redSocial) {
        this.redSocial = redSocial;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void darLike() {
        this.likes++;
    }
}
