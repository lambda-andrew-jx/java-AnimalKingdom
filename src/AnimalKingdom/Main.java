package AnimalKingdom;

import java.util.ArrayList;

public class Main {
    public static void printAnimals(ArrayList<AnimalAbstract> animals, CheckAnimal tester)
    {
        for (AnimalAbstract animal : animals)
        {
            if (tester.test(animal))
            {
                System.out.println(animal);
            }
        }
    }
    public static void main(String[] args) {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<AnimalAbstract> animalList = new ArrayList<AnimalAbstract>();
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);


        System.out.println("*** All Animals ***");
        printAnimals(animalList, a -> true);
        
        System.out.println("\n*** By Year Named ***");
        animalList.sort((a1, a2) -> a2.getDiscovered() - a1.getDiscovered());
        printAnimals(animalList, a -> true);

        System.out.println("\n*** By Name ***");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalList, a -> true);

        System.out.println("\n*** By Movement ***");
        animalList.sort((a1, a2) -> a1.getMovement().compareToIgnoreCase(a2.getMovement()));
        printAnimals(animalList, a -> true);

        System.out.println("\n*** With Lungs ***");
        printAnimals(animalList, a -> (a.getBreath() == "lungs"));

        System.out.println("\n*** With Lungs and Named in 1758 ***");
        printAnimals(animalList, a -> (a.getBreath() == "lungs") && (a.getDiscovered() == 1758));

        System.out.println("\n*** With Lungs and Lays Eggs ***");
        printAnimals(animalList, a -> (a.getBreath() == "lungs") && (a.getReproduction() == "eggs"));
    }

    
}