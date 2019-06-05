package kingdom;

public class Mammals extends Animal
{
	// Fields
	private static int maxId = 20;
	private int id;

// Constructor
	public Mammals(String name, int discovered)
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

// Overriding toString to this instead of pointer
	@Override
    public String toString()
    {
        return "Mammal {" +
                "name='" + name + '\''
                + discovered + " " +'}';
    }
}