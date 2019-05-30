package animalkingdom;

public class Mammals extends AbstractAnimals {
    public Mammals(int hunger, String name, int year) {
        super(hunger, name, year);
    }

    @Override
    public String move(String moveMethod) {
        return "moves by " + moveMethod;
    }
}