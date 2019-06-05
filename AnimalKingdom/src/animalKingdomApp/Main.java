package animalKingdomApp;

import java.util.ArrayList;

public class Main 
{
    public static void printAnimals(ArrayList<AbstractAnimal> animalsList, CheckAnimal tester)
    {
        for (AbstractAnimal animal : animalsList)
        {
            if (tester.test(animal))
            {
                System.out.println(animal);
            }
        }
    }
    public static void main(String[] args)
    {
        //Calling Classes to Make New Animals
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

        //Array List

        ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();
        animals.add(Panda);
        animals.add(Zebra);
        animals.add(Koala);
        animals.add(Sloth);
        animals.add(Armadillo);
        animals.add(Raccoon);
        animals.add(Bigfoot);
        animals.add(Pigeon);
        animals.add(Peacock);
        animals.add(Toucan);
        animals.add(Parrot);
        animals.add(Swan);
        animals.add(Salmon);
        animals.add(Catfish);
        animals.add(Perch);


        //Lambda Expressions
        System.out.println("*** All the Animals ***");
        printAnimals(animals, animal -> true);

        System.out.println();

        System.out.println("*** By Year Named ***");
        animals.sort((animal1, animal2) -> animal2.getDiscovered() - animal1.getDiscovered());
        printAnimals(animals, animal -> true);

        System.out.println();

        System.out.println("*** By Name ***");
        animals.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        printAnimals(animals, animal -> true);

        System.out.println();

        System.out.println("*** By Movement ***");
        animals.sort((animal1, animal2) -> animal1.getMovement().compareToIgnoreCase(animal2.getMovement()));
        printAnimals(animals, animal -> true);

        System.out.println();

        System.out.println("*** With Lungs ***");
        printAnimals(animals, animal -> (animal.getBreathe() == "lungs"));

        System.out.println();

        System.out.println("*** With Lungs and Named in 1758 ***");
        printAnimals(animals, animal -> (animal.getBreathe() == "lungs") && (animal.getDiscovered() == 1758));

        System.out.println();

        System.out.println("*** With Lungs and Lays Eggs ***");
        printAnimals(animals, animal -> (animal.getBreathe() == "lungs") && (animal.getReproduction() == "eggs"));

        System.out.println();

        System.out.println("*** Named in 1758 ***");
        printAnimals(animals, animal -> (animal.getDiscovered() == 1758));


        System.out.println();

        System.out.println("*** Mammals Listed Alphabetically ***");
        animals.sort((animal1, animal2) -> animal1.getName().compareToIgnoreCase(animal2.getName()));
        printAnimals(animals, animal -> (animal instanceof Mammal));
    }
}