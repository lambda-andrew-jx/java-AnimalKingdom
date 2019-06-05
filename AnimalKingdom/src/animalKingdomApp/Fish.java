package animalKingdomApp;

public class Fish extends AbstractAnimal
{

    public Fish(String name, int discovered)
    {
        super(name, discovered);

        setBreathe("gills");
        setMovement("swimming");
        setReproduction("eggs");
    }
}