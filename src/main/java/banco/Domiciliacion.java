package banco;

public class Domiciliacion {
    private int n_doc;
    private String nombre;
    private int cantidad;
    private CuentaCorriente cuentaCorriente;

    public Domiciliacion(int n_doc, String nombre, int cantidad, CuentaCorriente cuentaCorriente) {
        this.n_doc = n_doc;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cuentaCorriente = cuentaCorriente;
        this.cuentaCorriente.getDomiciliaciones().add(this);
    }

    public int getN_doc() {
        return n_doc;
    }

    public void setN_doc(int n_doc) {
        this.n_doc = n_doc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CuentaCorriente getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }

    @Override
    public String toString(){
        return this.n_doc + " - " + this.nombre + " - " + this.cantidad;
    }
}
