package AnimalKingdom;


public class Fish extends Animal{

	public Fish(String name, int yearNamed) {
		super(name, yearNamed);
	}

    @Override
	public String move() {
		return "swim";
	}

    @Override
	public String breath() {
		return "gills";
    }
    
    @Override
	public String reproduce() {
		return "eggs";
	}
} 