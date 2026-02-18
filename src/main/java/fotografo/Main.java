package fotografo;

public class Main {
    public static void main(String[] args) {
        Camara nikon = new Camara("nikon");
        Fotografo pepe = new Fotografo("Pepe", nikon);
        pepe.tomarFoto();
        Movil m = new Movil("Android");
        Fotografo juen = new Fotografo("juan", m);
        juen.tomarFoto();
        GoPro gp = new GoPro("GoPro");
        Fotografo maria = new Fotografo("María", gp);
        maria.tomarFoto();
        maria.setAparato(m);
        maria.tomarFoto();
    }
}
