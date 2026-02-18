package animales;

public class Entrenador extends Mamifero{
    Entrenador(String nombre){
        super(nombre);
    }

    public void Entrenar(Jugar animalQueSabeJugar){
            animalQueSabeJugar.perseguirUnObjeto("globo");
    }
    /**
     * Solo deja entrar a aquellos animales que saben jugar
     */
    public void dejarEntrar (Animal animal){
        if (animal instanceof Jugar){
            System.out.println("Pasa y te entreno");
        }else{
            throw new IllegalArgumentException(animal.getClass().getName() + " no implementa la interfaz Jugar");

        }
    }

}
