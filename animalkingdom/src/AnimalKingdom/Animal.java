package AnimalKingdom;


public abstract class Animal {
	protected int maxId = 0;

	protected int id;
	protected String name;
	protected int yearNamed;

	public Animal(String name, int yearNamed) {
		this.id = maxId++;
		this.name = name;
		this.yearNamed = yearNamed;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();

	public String eat() { 
		return "The " + name + " is eating.";
	}

	public String getName() { return name; }
    public int getyearNamed() { return yearNamed; }
}