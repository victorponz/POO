package fotografo;

public class GoPro implements TomarFoto{
    private String nombre;
    public GoPro(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public void tomarFoto(){
        System.out.println("hago una foto con la go pro");
    }
}
