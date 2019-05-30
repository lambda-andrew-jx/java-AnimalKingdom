package animalkingdom;

public class Mammal extends Animal
{
    private static int maxId = 0;

    public Mammal(String name, int yearDiscovered)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String move()
    {
        return("walks");
    }

    public String breath()
    {
        return("lungs");
    }

    public String reproduce()
    {
        return("gives birth");
    }

    @Override
    public String toString()
    {
        return "Mammal{" + "id:'" + id +'\'' + ", name:" + name + ", year named:" + yearDiscovered + "}";
    }
}