package banco;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int n_suc;
    private String direccion;
    private Banco banco;
    private List<CuentaCorriente> cuentaCorrientes = new ArrayList<>();
    public Sucursal(int n_suc, String direccion, Banco banco) {
        this.n_suc = n_suc;
        this.direccion = direccion;
        this.banco = banco;
        this.banco.getSucursales().add(this);
    }

    public int getN_suc() {
        return n_suc;
    }

    public void setN_suc(int n_suc) {
        this.n_suc = n_suc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public List<CuentaCorriente> getCuentaCorrientes() {
        return cuentaCorrientes;
    }

    @Override
    public String toString(){
        return this.n_suc + " - " + this.direccion;
    }
}
