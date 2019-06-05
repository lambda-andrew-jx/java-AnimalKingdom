package kingdom;

public abstract class Animal
{

	public String name;
    public int discovered;

	public abstract String move();
	public abstract String breathe();
	public abstract String reproduce();

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