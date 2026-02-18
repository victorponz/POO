package redsocial;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Mensaje> mensajesUsuario(Usuario u){
        List<Mensaje> mensajes = u.getMensajes();
        return  mensajes;
    }
    public static void main(String[] args) {
        RedSocial x = new RedSocial("X");
        Usuario pepe = new Usuario("pepe", x);
        Usuario maria = new Usuario("maria", x);
        Usuario juan = new Usuario("juan", x);
        Mensaje t1 = new Texto("88", pepe,  "HOY", x, "Este es el primer mensaje");
        Mensaje f2 = new Fotografia("99", maria,  "ayer", x, "Título", "foto.jpg");
        t1.darLike();
        Comentario c = new Comentario(pepe, "Hola,", f2);
        Comentario d = new Comentario(juan, "Adiós", f2);
        List<Mensaje> mensajesPepe = mensajesUsuario(pepe);
    }
}
