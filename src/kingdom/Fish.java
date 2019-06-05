package kingdom;

public class Fish extends Animal
{
	private static int maxId = 10;
	private int id;

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

	public String move()
	{
		return "fins";
	}

	public String breathe()
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
        return "Fish {" +
                "name='" + name + '\''
                + discovered + " " +'}';
    }
}