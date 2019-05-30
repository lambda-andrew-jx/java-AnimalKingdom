package animalkingdom;

import java.util.ArrayList;

public class Main
{
    public static void printAnimals(ArrayList<Animal> animal, CheckAnimal tester)
    {
        for (Animal ani : animal)
        {
            if(tester.test(ani))
            {
                System.out.println(ani.toString());
            }
        }
    }
    public static void main(String[] args)
    {
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
        Bird swan = new Bird("Swan", 1958);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        
        ArrayList<Mammal> mammalArrayList = new ArrayList<Mammal>();
        mammalArrayList.add(panda);
        mammalArrayList.add(zebra);
        mammalArrayList.add(koala);
        mammalArrayList.add(sloth);
        mammalArrayList.add(armadillo);
        mammalArrayList.add(raccoon);
        mammalArrayList.add(bigfoot);
        
        ArrayList<Bird> birdArrayList = new ArrayList<Bird>();
        birdArrayList.add(pigeon);
        birdArrayList.add(peacock);
        birdArrayList.add(toucan);
        birdArrayList.add(parrot);
        birdArrayList.add(swan);
        
        ArrayList<Fish> fishArrayList = new ArrayList<Fish>();
        fishArrayList.add(salmon);
        fishArrayList.add(catfish);
        fishArrayList.add(perch);
        
        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
        animalArrayList.addAll(mammalArrayList);
        animalArrayList.addAll(birdArrayList);
        animalArrayList.addAll(fishArrayList);
        System.out.println("*** ANIMAL LIST ***");
        System.out.println();
        System.out.println(animalArrayList.toString());
        System.out.println();
        //sorting and filtering
        System.out.println("*** FILTERING BY YEAR 1800 OR LATER***");
        System.out.println();
        printAnimals(animalArrayList, ani -> ani.getYear()>=1800);
        System.out.println();

        System.out.println("*** LIST ANIMALS IN DESCENDING ORDER BY YEAR NAMED ***");
        System.out.println();
        animalArrayList.sort((a1, a2) -> a1.getYear() - a2.getYear());
        animalArrayList.forEach((ani) -> System.out.println(ani));
        System.out.println();

        System.out.println("*** LIST ALL THE ANIMALS ALPHABETICALLY ***");
        System.out.println();
        animalArrayList.sort((a1, a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        animalArrayList.forEach((ani) -> System.out.println(ani.getName()));
        System.out.println();

        System.out.println("*** LIST ALL THE ANIMALS IN ORDER BY HOW THEY MOVE");
        System.out.println();
        animalArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalArrayList.forEach((ani) -> System.out.println(ani.move() + " animal: " + ani.getName()));
        System.out.println();

        System.out.println("*** LIST ALL THE ANIMALS THAT BREATH WITH LUNGS ***");
        System.out.println();
        printAnimals(animalArrayList, ani -> ani.breath() == "lungs");
        System.out.println();

        System.out.println("*** LIST ALL THE ANIMALS THAT BREATH WITH LUNGS AND WERE NAMED IN 1758 ***");
        System.out.println();
        printAnimals(animalArrayList, ani -> (ani.breath() == "lungs") && (ani.getYear() == 1758));
        System.out.println();

        System.out.println("*** LIST ONLY THE ANIMALS LAY EGGS AND BREATH WITH LUNGS ***");
        System.out.println();
        printAnimals(animalArrayList, ani -> (ani.reproduce() == "eggs") && (ani.breath() == "lungs"));
        System.out.println();

        System.out.println("*** LIST ALPHABETICALLY ONLY THOSE ANIMALS NAMED IN 1758 ***");
        System.out.println();
        animalArrayList.sort((a1, a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalArrayList, ani -> ani.getYear() == 1758);
        System.out.println();

        //stretch 
        System.out.println("*** LIST ALPHABETICALLY THOSE ANIMALS THAT ARE MAMMALS");
        System.out.println();
        mammalArrayList.sort((a1, a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        mammalArrayList.forEach(ani -> System.out.println(ani.getName()));
    }
}
