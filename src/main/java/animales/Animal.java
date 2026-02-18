package animales;

/**
 * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
 */
public abstract class Animal
{
    private String nombre;

    /**
     * Constructor para objetos de la clase Animal
     */
    public Animal(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }


    public void comunicarse()
    {
        System.out.println("Mi nombre es " + nombre);
    }


    public abstract void respirar();

    public void moverse()
    {
        System.out.println("Me muevo a 4 patas");
    }
    @Override
    public String toString()
    {
        return "Animal: " + nombre;
    }
}
