package animalKingdom;

public class Fish extends Animals
{
    private static int maxId = 0;

    public Fish( String name, int year)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    public String move()
    {
        return "Swim"; 
    }

    public String breath()
    {
        return "gills";
    }

    public String reproduce()
    {
        return "eggs";
    }

    @Override
    public String toString()
    {
        return "Fish " + "id: " + id + " " + name + " was named in the year "+ year + " ";
    }

}
 