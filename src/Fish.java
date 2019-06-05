public class Fish extends AbstractAnimal {

    public Fish(String name, int year) {
        super(name, year);  //calling parents' constructor
    }

    @Override   //getting the info from the parent class
    public String move() { return "swim"; }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}


