package banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco(1, "Santander");
        Sucursal suc1 = new Sucursal(1, "C/ Mayor", santander);
        Cliente pepe = new Cliente("949549", "Pepe");
        CuentaCorriente ccPepe = new CuentaCorriente("1", 100, pepe, suc1);
        Domiciliacion gas = new Domiciliacion(1, "Gas", 100, ccPepe);
        Prestamo prestamo = new Prestamo(1, 1000, pepe);
    }
}
