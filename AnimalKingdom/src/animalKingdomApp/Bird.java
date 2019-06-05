package animalKingdomApp;

public class Bird extends AnimalAbstract
{

    public Bird(String name, int discovered)
    {
        super(name, discovered);

        setBreath("lungs");
        setMovement("flying");
        setReproduction("eggs");
    }
}