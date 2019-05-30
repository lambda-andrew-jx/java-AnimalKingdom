package animalKingdom;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals racoon = new Mammals("Racoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);

        Birds pigeon = new Birds("Pigeon", 1837);
        Birds peacock = new Birds("Peacock", 1821);
        Birds toucan = new Birds("Toucan", 1758);
        Birds parrot = new Birds("Parrot", 1824);
        Birds swan = new Birds("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);


        ArrayList<Mammals> mammalsList = new ArrayList<Mammals>();
        mammalsList.add(panda);
        mammalsList.add(zebra);
        mammalsList.add(koala);
        mammalsList.add(sloth);
        mammalsList.add(armadillo);
        mammalsList.add(racoon);
        mammalsList.add(bigfoot);

        ArrayList<Birds> birdsList = new ArrayList<Birds>();
        birdsList.add(pigeon);
        birdsList.add(peacock);
        birdsList.add(toucan);
        birdsList.add(parrot);
        birdsList.add(swan);
        
         ArrayList<Fish> fishList = new ArrayList<Fish>();
         fishList.add(salmon);
         fishList.add(catfish);
         fishList.add(perch);

         ArrayList<Animals> animalsList = new ArrayList<Animals>();
         animalsList.addAll(mammalsList);
         animalsList.addAll(birdsList);
         animalsList.addAll(fishList);

         System.out.println(animalsList);

         System.out.println("*** Descending by year ***");

          animalsList.sort((a1, a2) -> a1.getYear() - a2.getYear());
          animalsList.forEach((a) -> System.out.println(a.getYear()));

        System.out.println("*** Alphabetically ***");
         animalsList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
         animalsList.forEach((a) -> System.out.println(a.getName()));

         System.out.println("*** Movement ***");
         animalsList.sort((a1, a2) -> a1.move().compareTo(a2.move()));
         animalsList.forEach((a) -> System.out.println(a.move()));

         System.out.println("*** Breath with lungs ***");

         
         animalsList.sort((a1, a2) -> a1.breath().compareTo(a2.breath()));
         animalsList.forEach((a) -> System.out.println(a.breath()));




    }
}