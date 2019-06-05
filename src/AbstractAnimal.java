//field
public abstract class AbstractAnimal {
    static int maxId = 0;
    int id;
    String name;
    int year;

    //constructor
    public AbstractAnimal(String name, int year) {
        id = maxId++;
        this.name = name;
        this.year = year;

    }

    //method
    public int getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public  String eat(){
        return  "eat";
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();
}
