package kingdom;

public class Birds extends Animal
{
	private static int maxId = 0;
	private int id;

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

	@Override
    public String toString()
    {
        return "Bird {" +
                "name='" + name + '\''
                + discovered + " " + '}';
    }
}