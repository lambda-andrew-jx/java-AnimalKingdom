package animalkingdom;

public abstract class Animal
{
    public int id;
    public String name;
    public int yearDiscovered;

    public abstract move();
    public abstract breath();
    public abstract reproduce();
    
}