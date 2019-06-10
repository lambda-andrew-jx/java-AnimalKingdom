package kingdom;

public class Birds extends Animal
{
// Fields
	// private holds it within this class, static means it covers all class and does not reset
	private static int maxId = 0;
	private int id;

// Constructor
	public Birds(String name, int discovered)
	{
		maxId++;
		id = maxId;

		this.name = name;
		this.discovered = discovered;
	}

	// ID Getter
	public int getId()
	{
		return id;
	}

	// Setting abstract methods
	public String move()
	{
		return "wings";
	}

	public String breathe()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "eggs";
	}
// Overriding toString to below string
	@Override
    public String toString()
    {
        return "Bird {" +
                "name='" + name + '\''
                + discovered + " " + '}';
    }
}