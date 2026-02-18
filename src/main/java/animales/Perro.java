package animales;

public class Perro extends Mamifero{

    Perro(String nombre){
        super(nombre);
    }

    public void traerZapatillas(){
        System.out.println("Toma amo tus zapatillas");
    }

    @Override
    public void comunicarse()
    {
        System.out.println("guau");
    }


}
