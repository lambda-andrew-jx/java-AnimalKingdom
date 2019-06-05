package kingdom;

public class Mammals extends Animal
{
	private static int maxId = 20;
	private int id;

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

	public String move()
	{
		return "legs";
	}

	public String breathe()
	{
		return "lungs";
	}

	public String reproduce()
	{
		return "birth";
	}

	@Override
    public String toString()
    {
        return "Mammal {" +
                "name='" + name + '\''
                + discovered + " " +'}';
    }
}