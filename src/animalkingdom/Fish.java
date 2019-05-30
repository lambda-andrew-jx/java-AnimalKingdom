package animalkingdom;

public class Fish extends AbstractAnimals {
    public Fish(int hunger, String name, int year) {
        super(hunger, name, year);

    }

    @Override
    public String move(String moveMethod) {
        return "swimms by " + moveMethod;
    }
}