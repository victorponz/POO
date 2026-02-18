package fotografo;

public class Camara implements TomarFoto{
    private String nombre;
    public Camara(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public void tomarFoto(){
        System.out.println("hago una foto con la cámara");
    }
}
