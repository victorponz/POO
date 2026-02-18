package subasta;

public class Articulo {
    private String nombre;
    private double precio;
    private Lote lote;
    public Articulo(String nombre, double precio, Lote lote) {
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
        this.lote.getArticulos().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }

    public void pujar(double cantidad) {
        if (cantidad > this.precio) {
            this.precio = cantidad;
        }
    }

    public void vender() {
        System.out.println("El artículo " + nombre + " ha sido vendido por " + precio + " euros.");
    }
}
