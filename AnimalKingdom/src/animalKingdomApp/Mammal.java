package animalKingdomApp;

public class Mammal extends AbstractAnimal
{

    public Mammal(String name, int discovered)
    {
        super(name, discovered);

        setBreathe("lungs");
        setMovement("walking");
        setReproduction("live births");
    }
}
