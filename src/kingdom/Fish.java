package kingdom;

public class Fish extends Animal
{
	private static int maxId = 10;
	private int id;

	public String name;
	public int discovered;

	public Fish(String name, int discovered)
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
		return name;
	}
	public int getYear()
	{
		return discovered;
	}

	public String move()
	{
		return "I swim with my fins";
	}

	public String breathe()
	{
		return "I breathe with my gills";
	}

	public String reproduce()
	{
		return "I give birth through eggs";
	}

	@Override
    public String toString()
    {
        return "Fish {" +
                "name='" + name + '\''
                + '}';
    }
}