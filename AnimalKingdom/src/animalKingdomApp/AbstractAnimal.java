package animalKingdomApp;

public abstract class AbstractAnimal
{

    private static int maxID = 0;
    private int id;
    private int discovered;
    private String name;

    private String breathe;
    private String movement;
    private String reproduction;


    public AbstractAnimal(String name, int discovered)
    {
        setID();

        this.name = name;
        this.discovered = discovered;
        this.breathe = "";
        this.movement = "";
        this.reproduction = "";
    }

    public void setID()
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

    public String getBreathe() {
        return this.breathe;
    }

    public void setBreathe(String breathe) {
        this.breathe = breathe;
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

    public String eat(String food)
    {
        return this.name + " ate " + food;
    }

    public String breathe()
    {
        return getName() + " breathes with " + getBreathe();
    }

    public String move()
    {
        return getName() + " moves by " + getMovement();
    }

    public String reproduce()
    {
        return getName() + " reproduces by " + getReproduction();
    }

    @Override
    public String toString()
    {
        return "The " + this.name + " was discovered in " + 
                this.discovered + ". It moves by " +
                this.movement + ", breathes with " +
                this.breathe + ", and reproduces via " +
                this.reproduction + ".";
    }
}