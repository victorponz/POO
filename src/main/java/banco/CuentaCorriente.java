package banco;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

class CuentaCorriente {
    private String n_cc;
    private double cantidad;
    private List<Cliente> clientes = new ArrayList<>();
    private Sucursal sucursal;
    private List<Domiciliacion> domiciliaciones = new ArrayList<>();
    public CuentaCorriente(String n_cc, double cantidad, List<Cliente> clientes, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.cantidad = cantidad;
        this.clientes = clientes;
        this.sucursal = sucursal;
        this.sucursal.getCuentaCorrientes().add(this);
    }

    public CuentaCorriente(String n_cc, double cantidad, Cliente cliente, Sucursal sucursal) {
        this.n_cc = n_cc;
        this.cantidad = cantidad;
        this.clientes.add(cliente);
        cliente.getCuentas().add(this);
        this.sucursal = sucursal;
        this.sucursal.getCuentaCorrientes().add(this);
    }


    public String getN_cc() {
        return n_cc;
    }

    public void setN_cc(String n_cc) {
        this.n_cc = n_cc;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public List<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void setDomiciliaciones(List<Domiciliacion> domiciliaciones) {
        this.domiciliaciones = domiciliaciones;
    }

    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    @Override
    public String toString(){
        return this.n_cc + " - " + this.cantidad;
    }
}
