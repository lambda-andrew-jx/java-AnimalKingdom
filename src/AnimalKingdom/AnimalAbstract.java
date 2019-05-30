package AnimalKingdom;

public abstract class AnimalAbstract
{
    private static int maxID = 0;
    private int discovered;
    private String name;
    private int id;

    private String breath;
    private String movement;
    private String reproduction;

    public AnimalAbstract(String name, int discovered)
    {
        setID();

        this.name = name;
        this.discovered = discovered;
        this.breath = "";
        this.movement = "";
        this.reproduction = "";
    }

    private void setID()
    {
        this.id += ++maxID;
    }

    public int getId() {
        return this.id;
    }

    public int getDiscovered() {
        return this.discovered;
    }

    public void setDiscovered(int discovered) {
        this.discovered = discovered;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreath() {
        return this.breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }

    public String getMovement() {
        return this.movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getReproduction() {
        return this.reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String eat(String food) {
        return this.name + " ate " + food;
    }

    public String breathe()
    {
        return getName() + " breathes with " + getBreath();
    }

    public String move()
    {
        return getName() + " moves by " + getMovement();
    }

    public String reproduce()
    {
        return getName() + " reproduces via " + getReproduction();
    }

    @Override
    public String toString()
    {
        return "The " + this.name + " was discovered in " + 
                this.discovered + ". It moves by " +
                this.movement + ", breathes with " +
                this.breath + ", and reproduces via " +
                this.reproduction + ".";
    }
}