package animalkingdom;

public class Fish extends AbstractAnimals {
    public Fish(int hunger, String name, int year) {
        super(hunger, name, year);

    }

    @Override
    public String move() {
        return "fins";
    }
    @Override public String breath(){
        return "gills";
    }
    @Override public String reproduce(){
        return "eggs";
    }

}