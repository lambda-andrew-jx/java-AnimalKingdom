package kingdom;

public abstract class Animal
{
// Fields

	public String name;
    public int discovered;
    
// Abstract methods to be named by each sub-class
	public abstract String move();
	public abstract String breathe();
	public abstract String reproduce();

// Methods

	public String eat()
	{
		return "I eat food with my mouth";
	}

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return discovered;
	}

}