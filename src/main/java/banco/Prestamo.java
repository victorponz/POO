package banco;

public class Prestamo {
    int n_pres;
    int cantidad;
    Cliente cliente;

    public Prestamo(int n_pres, int cantidad, Cliente cliente) {
        this.n_pres = n_pres;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.cliente.getPrestamos().add(this);
    }

    public int getN_pres() {
        return n_pres;
    }

    public void setN_pres(int n_pres) {
        this.n_pres = n_pres;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return this.n_pres + "";
    }
}
