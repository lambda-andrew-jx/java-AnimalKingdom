package animalkingdom;

public class Fish extends Animal
{
    private static int maxId = 0;

    public Fish(String name, int yearDiscovered)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String move()
    {
        return "swims";
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
        return "Fish{" + "id:'" + id +'\'' + ", name:" + name + ", year named:" + yearDiscovered + "}";
    }
}