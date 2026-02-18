import java.util.ArrayList;
import java.util.List;

public class MainOrdenador {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador("HP", "Pavillion", 32, 512, 1000);
        Ordenador o2 = new Ordenador("Dell", "Attitude");
        List<Ordenador> ordenadores = new ArrayList<>();
        o2.setRAM(64);
        o2.setHD(1024);
        o2.setPrecio(1200);
        ordenadores.add(o1);
        ordenadores.add(o2);
        ordenadores.stream().sorted((yo, otro) -> otro.precio - yo.precio).forEach(System.out::println);
    }
}
class Ordenador implements Comparable<Ordenador>{
    String marca;
    String modelo;
    int precio;
    int RAM;
    int HD;

    public Ordenador(String marca, String modelo, int RAM, int HD, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.RAM = RAM;
        this.HD = HD;
        this.precio = precio;
    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHD() {
        return HD;
    }

    public void setHD(int HD) {
        this.HD = HD;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return marca + " - " + modelo + " - " + RAM + " - " + HD + " + " + precio;
    }

    @Override
    public int compareTo(Ordenador other){
        return this.precio - other.precio;
    }
}