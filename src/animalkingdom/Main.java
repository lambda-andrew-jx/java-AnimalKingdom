package animalkingdom;

import java.util.ArrayList;

public class Main {
    public static void FilterAnimals(ArrayList<AbstractAnimals> animals, FilterAnimals boolValue){
        for(AbstractAnimals animal : animals)
        {
            if(boolValue.test(animal)){
                System.out.println(animal.getName());
            }
        }
    }
    // public static void FilterAnimalsByType(ArrayList<AbstractAnimals> animals, FilterAnimals boolValue){
    //     for(AbstractAnimals animal : animals)
    //     {
    //         if(boolValue.test(animal)){
    //             System.out.println(animal.getName());
    //         }
    //     }
    // }
    public static void main(String[] args) {

        // Name: Panda Year Named: 1869
        // Name: Zebra Year Named: 1778
        // Name: Koala Year Named: 1816
        // Name: Sloth Year Named: 1804
        // Name: Armadillo Year Named: 1758
        // Name: Raccoon Year Named: 1758
        // Name: Bigfoot Year Named: 2021

        Fish salmon = new Fish(20, "salmon", 1758);
        Fish catfish = new Fish(20, "catfish", 1817);
        Fish perch = new Fish(20, "perch", 1758);

        Birds pidgeon = new Birds(40, "pidgeon", 1837);
        Birds peacock = new Birds(40, "peacock", 1821);
        Birds toucan = new Birds(40, "toucan", 1758);
        Birds parrot = new Birds(40, "parrot", 1824);
        Birds swan = new Birds(40, "swan", 1758);

        Mammals panda = new Mammals(50, "Panda", 1869);
        Mammals zebra = new Mammals(40, "Zebra", 1778);
        Mammals koala = new Mammals(50, "Koala", 1816);
        Mammals sloth = new Mammals(50, "Sloth", 1804);
        Mammals armadillo = new Mammals(50, "Armadillo", 1758);
        Mammals raccoon = new Mammals(50, "Raccoon", 1758);
        Mammals bigfoot = new Mammals(50, "BigFoot", 2021);

        ArrayList<AbstractAnimals> myList = new ArrayList<AbstractAnimals>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(koala);
        myList.add(raccoon);
        myList.add(bigfoot);

        myList.add(pidgeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);

        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        System.out.println(myList);
        System.out.println("*** Alphabetical Order ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach((a) -> System.out.println(a.getName()));
        System.out.println();

        System.out.println("*** Decending year order ***\n");
     System.out.println(myList.get(1).getYear());
        myList.sort((a1,a2)-> a2.getYear() - a1.getYear());
        myList.forEach((a)-> System.out.println(a.getYear()));
        System.out.println();

        System.out.println("*** If they breath with lungs");
        FilterAnimals(myList, (a)-> a.breath() == "lungs");
        System.out.println();

       System.out.println("*** list all animals in order by how they move");
       myList.sort((a1,a2)-> a1.move().compareToIgnoreCase(a2.move()));
       myList.forEach(a-> System.out.println(a.getName() + " " + a.move()));


       System.out.println("*** list only animals that breath with lung and were named in 1785 ***\n");
       FilterAnimals(myList, (a)-> a.breath()=="lungs" && a.getYear()==1758);

        System.out.println("*** List only those animals that lay eggs and breath with lungs ***\n");
        FilterAnimals(myList, (a)-> a.reproduce()=="eggs" && a.breath()=="lungs");

        System.out.println("*** List alphabetically all the Mammals***");
        myList.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        FilterAnimals(myList, (a)->a instanceof Mammals);
    }
}