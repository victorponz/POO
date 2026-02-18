package fotografo;

public class Fotografo {
    private String nombre;
    private TomarFoto aparato;
    public Fotografo(String nombre, TomarFoto aparato) {
        this.nombre = nombre;
        this.aparato = aparato;
    }

    public String getNombre() {
        return nombre;
    }
    public void tomarFoto() {
        this.aparato.tomarFoto();
    }

    public void setAparato(TomarFoto aparato){
        this.aparato = aparato;
    }

}

