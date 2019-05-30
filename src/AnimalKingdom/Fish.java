package AnimalKingdom;

public class Fish extends AnimalAbstract
{

    public Fish(String name, int discovered)
    {
        super(name, discovered);

        setBreath("gills");
        setMovement("swimming");
        setReproduction("eggs");
    }
}