class Triangulo {
    private int id;
    protected String color;
    private int angle;
    private int x;
    private int y;
    private static int contador = 0;

    public Triangulo() {
        this.id = contador++;
    }

    public final Triangulo setColor(String color){
        this.color = color;
        return this;
    }

    public Triangulo setAngle(int angle){
        this.angle = angle;
        return this;
    }

    public Triangulo setX(int x){
        this.x = x;
        return this;
    }
    public Triangulo setY(int y){
        this.y = y;
        return this;
    }
}
public class MainTriangulo {
    public static void main(String[] args) {
        final Triangulo triangulo = new Triangulo();
        final Triangulo triangulo2 = new Triangulo();
		//Para usar un setter se debe prefijar siempre con el nombre de la instancia
        triangulo.setColor("Rojo").setAngle(90).setX(10).setY(20);
        triangulo.setAngle(90);

    }
}
