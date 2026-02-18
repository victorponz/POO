package fotografo;

public class Movil implements TomarFoto{
    private String nombre;
    public Movil(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public void tomarFoto(){
        System.out.println("hago una foto con la móvil");
    }
}
