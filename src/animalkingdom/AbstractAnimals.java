package animalkingdom;

public abstract class AbstractAnimals {
    protected int hunger;
    protected String name;
    protected int year;
    public AbstractAnimals(int hunger, String name, int year) {
        this.hunger = hunger;
        this.name = name;
        this.year = year;
    }

    public void eat() {
        hunger--;
    }

    public void eatFood(int foodAmt) {
        hunger = -foodAmt;
    }

    public int getHungerLevel() {
        return hunger;
    }

    public abstract breath();
    public abstract String move(String move);
    // public void breath(String getOxygen) {
    //     System.out.println(getOxygen);
    // }

    // public void move(String getMoving) {
    //     System.out.println(getMoving);
    // }
    public String getName(){
        return name;
    }public setName(String name){
        this.name=name;
    }

}