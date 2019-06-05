package kingdom;

public class Birds extends Animal
{
	private static int maxId = 0;
	private int id;

	public String name;
	public int discovered;

	public Birds(String name, int discovered)
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
		return "I fly with my wings";
	}

	public String breathe()
	{
		return "I breathe with my lungs";
	}

	public String reproduce()
	{
		return "I give birth through eggs";
	}

	@Override
    public String toString()
    {
        return "Bird {" +
                "name='" + name + '\''
                + '}';
    }
}