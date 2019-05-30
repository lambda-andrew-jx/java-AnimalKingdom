package animalKingdom;

public class Mammals extends Animals
{
    private static int maxId = 0;

    public Mammals( String name, int year)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
    }

    public String move()
    {
        return "walks"; 
    }

    public String breath()
    {
        return "Lungs";
    }

    public String reproduce()
    {
        return "live birth";
    }

    @Override
    public String toString()
    {
        return "Mammals " + "id: " + id + " " + name + " was named in the year "+ year +" ";
    }

}
 