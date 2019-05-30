package animalKingdom;

public abstract class Animals
{
    public int id;
    public String name;
    public int year;

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public String getName()
    {
        return name;
    }

    public int getYear()
    {
        return year;
    }
}