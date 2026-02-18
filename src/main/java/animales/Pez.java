package animales;

public abstract class Pez extends Animal{

    Pez(String nombre){
        super(nombre);
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por branquias");
    }
}
