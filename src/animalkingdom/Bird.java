package animalkingdom;

public class Bird extends Animal
{
    private static int maxId = 0;

    public Bird(String name, int yearDiscovered)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public String move()
    {
        return("flies");
    }

    public String breath()
    {
        return("lungs");
    }

    public String reproduce()
    {
        return("eggs");
    }
    @Override
    public String toString()
    {
        return "Bird{" + "id:'" + id +'\'' + ", name:" + name + ", year named:" + yearDiscovered + "}";
    }
}