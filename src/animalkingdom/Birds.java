package animalkingdom;

public class Birds extends AbstractAnimals  {
    public Birds(int hunger, String name, int year) {
        super(hunger, name, year);

    }
    
    @Override
    public String move(String moveMethod) {
        return "flies with " + moveMethod;
    }

}