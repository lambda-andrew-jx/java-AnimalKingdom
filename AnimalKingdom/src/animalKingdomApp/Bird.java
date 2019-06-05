package animalKingdomApp;

public class Bird extends AbstractAnimal
{

    public Bird(String name, int discovered)
    {
        super(name, discovered);

        setBreathe("lungs");
        setMovement("flying");
        setReproduction("eggs");
    }
}