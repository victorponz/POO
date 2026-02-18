package facultad;

public class Main {
    public static void main(String[] args) {
        Facultad facultad = new Facultad("UJI");
        Catedra catedra = new Catedra("Cátreda", facultad);
        AreaConocimiento redes = new AreaConocimiento("Redes");
        Departamento inf = new Departamento("Informática", catedra, redes);
        Profesor pepe = new Profesor(1, "Pepe", inf);
        Adscrito adscrito = new Adscrito(catedra, pepe, "hoy");
    }
}
