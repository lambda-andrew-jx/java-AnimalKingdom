package animalkingdom;

public abstract class Animal
{
    public int id;
    public String name;
    public int yearDiscovered;

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();
    
}