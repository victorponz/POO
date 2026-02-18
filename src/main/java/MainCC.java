import java.util.stream.IntStream;

class CC{
    String titular;
    double cantidad;

    public CC(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public CC(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void ingresar(double cantidad){
        if (cantidad > 0)
            this.cantidad += cantidad;
    }
    public void retirar(double cantidad){
        if (this.cantidad >= cantidad)
            this.cantidad -= cantidad;
    }
    @Override
    public String toString(){
        return this.titular + " - " + this.cantidad;
    }
}
public class MainCC {
    public static void main(String[] args) {
        CC cuentaPepe = new CC("Pepe", 100);
        cuentaPepe.ingresar(200);
        cuentaPepe.retirar(100);
        System.out.println(cuentaPepe);

        CC cuentaMaria = new CC("Maria");
        cuentaMaria.retirar(200);
        cuentaMaria.ingresar(500);
        cuentaMaria.retirar(100);
        System.out.println(cuentaMaria);

    }
}
