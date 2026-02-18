package animales;

public abstract class Mamifero extends Animal{
    Mamifero(String nombre){
        super(nombre);
    }
    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por los pulmones");
    }
}
