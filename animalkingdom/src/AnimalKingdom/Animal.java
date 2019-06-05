package AnimalKingdom;


public abstract class Animal {
	protected int maxId = 0;

	protected int id;
	protected String name;
	protected int yearDiscovered;

	public Animal(String name, int yearDiscovered) {
		this.id = maxId++;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();

	public String eat() { 
		return "The " + name + " is eating.";
	}

	public String getName() { return name; }
    public int getYearDiscovered() { return yearDiscovered; }
}