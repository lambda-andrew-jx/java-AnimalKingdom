package animalKingdomApp;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        Mammal Panda = new Mammal("Panda", 1869);
        Mammal Zebra = new Mammal("Zebra", 1778);
        Mammal Koala = new Mammal("Koala", 1816);
        Mammal Sloth = new Mammal("Sloth", 1804);
        Mammal Armadillo = new Mammal("Armadillo", 1758);
        Mammal Raccoon = new Mammal("Raccoon", 1758);
        Mammal Bigfoot = new Mammal("Bigfoot", 2021);

        Bird Pigeon = new Bird("Pigeon", 1837);
        Bird Peacock = new Bird("Peacock", 1821);
        Bird Toucan = new Bird("Toucan", 1758);
        Bird Parrot = new Bird("Parrot", 1824);
        Bird Swan = new Bird("Swan", 1758);

        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);
    }
}