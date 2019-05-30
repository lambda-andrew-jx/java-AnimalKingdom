package AnimalKingdom;

public class Mammal extends AnimalAbstract
{

    public Mammal(String name, int discovered)
    {
        super(name, discovered);

        setBreath("lungs");
        setMovement("walking");
        setReproduction("live births");
    }
}