package banco;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private List<Prestamo> prestamos = new ArrayList<>();
    private List<CuentaCorriente> cuentas = new ArrayList<>();
    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public Cliente(String dni, String nombre, List<Prestamo> prestamos) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestamos = prestamos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void addPrestamo(Prestamo prestamo){
        this.prestamos.add(prestamo);
    }

    public List<CuentaCorriente> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.dni;
    }
}
