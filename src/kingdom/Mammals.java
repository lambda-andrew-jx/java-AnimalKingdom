package kingdom;

public class Mammals extends Animal
{
	private static int maxId = 20;
	private int id;

	public String name;
	public int discovered;

	public Mammals(String name, int discovered)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.discovered = discovered;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return this.name;
	}

	public int getYear()
	{
		return discovered;
	}

	public String move()
	{
		return "I walk with legs";
	}

	public String breathe()
	{
		return "I breathe with my lungs";
	}

	public String reproduce()
	{
		return "I give live birth";
	}

	@Override
    public String toString()
    {
        return "Mammal {" +
                "name='" + name + '\''
                + '}';
    }
}