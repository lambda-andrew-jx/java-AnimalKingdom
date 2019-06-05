package kingdom;

public abstract class Animal
{
	public abstract String move();
	public abstract String breathe();
	public abstract String reproduce();

	public String eat()
	{
		return "I eat food with my mouth";
	}


}