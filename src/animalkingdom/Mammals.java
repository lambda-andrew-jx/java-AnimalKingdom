package animalkingdom;

public class Mammals extends AbstractAnimals {
    public Mammals(int hunger, String name, int year) {
        super(hunger, name, year);
    }

    @Override
    public String move() {
        return "legs";
    }
    @Override public String breath(){
        return "lungs";
    }
    @Override public String reproduce(){
        return "birth";
    }

}