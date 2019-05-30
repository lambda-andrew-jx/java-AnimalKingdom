package animalKingdom;

public class Birds extends Animals
{
    private static int maxId = 0;

    public Birds( String name, int year)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    public String move()
    {
        return "Fly"; 
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Birds{" + "id: " + id + " " + name + " was named in the year "+ year + "}";
    }

}
 