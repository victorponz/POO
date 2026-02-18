import javax.swing.plaf.PanelUI;

public class MainAireAcondicionado {
    public static void main(String[] args) {
        AireAcondicionado aa = new AireAcondicionado("AC", 30, 10, 25);
        System.out.println(aa);
        aa.setTemperatura(11);
        System.out.println(aa);
        aa.bajar();
        System.out.println(aa);
        aa.bajar();
        System.out.println(aa);

    }
}
class AireAcondicionado{
    String nombre;
    int maxima;
    int minima;
    int temperatura;

    public AireAcondicionado(String nombre, int maxima, int minima, int temperatura) {
        this.nombre = nombre;
        this.maxima = maxima;
        this.minima = minima;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMaxima() {
        return maxima;
    }

    public int getMinima() {
        return minima;
    }
    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura <= maxima && temperatura >= minima)
            this.temperatura = temperatura;
        else
            this.temperatura = maxima;
    }

    public void subir(){
        if (!(temperatura + 1 > maxima))
            temperatura++;
    }

    public void bajar(){
        if (!(temperatura - 1 < minima))
            temperatura--;
    }

    @Override
    public String toString(){
        return "" + this.temperatura;
    }

}
