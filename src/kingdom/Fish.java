package kingdom;

public class Fish extends Animal
{
	// Fields
	private static int maxId = 10;
	private int id;

	// Constructor
	public Fish(String name, int discovered)
	{
		// Counter variable
		maxId++;
		id = maxId;

		this.name = name;
		this.discovered = discovered;
	}

// id getter
	public int getId()
	{
		return id;
	}

// Setting abstract methods
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

// Override toString to below string rather than pointer
	@Override
    public String toString()
    {
        return "Fish {" +
                "name='" + name + '\''
                + discovered + " " +'}';
    }
}