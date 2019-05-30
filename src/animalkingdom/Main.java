package animalkingdom;

public class Main {
    public static void main(String[] args) {

        // Name: Panda Year Named: 1869
        // Name: Zebra Year Named: 1778
        // Name: Koala Year Named: 1816
        // Name: Sloth Year Named: 1804
        // Name: Armadillo Year Named: 1758
        // Name: Raccoon Year Named: 1758
        // Name: Bigfoot Year Named: 2021
        Mammals panda = new Mammals(50, "Panda", 1869);
        Mammals zebra = new Mammals(40, "Zebra", 1778);
        Mammals koala = new Mammals(50, "Koala", 1816);
        Mammals sloth = new Mammals(50, "Sloth", 1804);
        Mammals armadillo = new Mammals(50, "Armadillo", 1758);
        Mammals raccoon = new Mammals(50, "Raccoon", 1758);
        Mammals bigfoot = new Mammals(50, "BigFoot", 2021);

        // Name: Pigeon Year Named: 1837
        // Name: Peacock Year Named: 1821
        // Name: Toucan Year Named: 1758
        // Name: Parrot Year Named: 1824
        // Name: Swan Year Named: 1758
        Birds pidgeon = new Birds(40, "pidgeon", 1837);
        Birds peacock = new Birds(40, "peacock", 1821);
        Birds toucan = new Birds(40, "toucan", 1758);
        Birds parrot = new Birds(40, "parrot", 1824);
        Birds swan = new Birds(40, "swan", 1758);

        // Name: Salmon Year Named: 1758
        // Name: Catfish Year Named: 1817
        // Name: Perch Year Named: 1758
        Fish salmon = new Fish(20, "salmon", 1758);
        Fish catfish = new Fish(20, "catfish", 1817);
        Fish perch = new Fish(20, "perch", 1758);
        
    }
}