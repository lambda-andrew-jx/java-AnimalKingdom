package animalkingdom;

public class Birds extends AbstractAnimals  {
    public Birds(int hunger, String name, int year) {
        super(hunger, name, year);

    }
    
    @Override
    public String move() {
        return "flying";
    }
    @Override public String breath(){
        return "lungs";
    }
    @Override public String reproduce(){
        return "eggs";
    }

}