package kingdom;

import java.util.*;

public class Main
{
	public static void printAnimals(ArrayList<Animal> animal, CheckAnimals tester)
    {
    								// pass in an ArrayList of "Animal" type, pass in tester of CheckAnimal type(class)
        for (Animal a : animal)
        {

            if(tester.test(a))
            {
            	// if it passes the test, then it moves to be printed
                System.out.println(a.toString());
            };
        };
    }

	public static void main(String[] args)
	{
// Intialize all animals

		Mammals panda = new Mammals("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigfoot = new Mammals("Bigfoot", 2021);

		Birds pigeon = new Birds("Pigeon", 1837);
		Birds peacock = new Birds("Peacock", 1821);
		Birds toucan = new Birds("Toucan", 1758);
		Birds parrot = new Birds("Parrot", 1824);
		Birds swan = new Birds("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

// Start of arraylist

		ArrayList<Animal> allAnimals = new ArrayList<Animal>();

		allAnimals.add(panda);
		allAnimals.add(zebra);
		allAnimals.add(koala);
		allAnimals.add(sloth);
		allAnimals.add(armadillo);
		allAnimals.add(raccoon);
		allAnimals.add(bigfoot);
		allAnimals.add(pigeon);
		allAnimals.add(peacock);
		allAnimals.add(toucan);
		allAnimals.add(parrot);
		allAnimals.add(swan);
		allAnimals.add(salmon);
		allAnimals.add(catfish);
		allAnimals.add(perch);

		// #1
		System.out.println("List all the animals in descending order by year named\n");
		allAnimals.sort((o1, o2) -> o2.getYear() - o1.getYear());
		allAnimals.forEach(a -> System.out.println(a.toString()));
		System.out.println();

		// #2 	
		System.out.println("List all the animals alphabetically\n");
		allAnimals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		allAnimals.forEach(a -> System.out.println(a.toString()));
		System.out.println();

		// #3
		System.out.println("List all the animals order by how they move\n");
		allAnimals.sort((o1, o2) -> o1.move().compareToIgnoreCase(o2.move()));
		allAnimals.forEach(a -> System.out.println(a.toString()));
		System.out.println();

		// #4
		System.out.println("List only those animals the breath with lungs\n");
		printAnimals(allAnimals, a -> (a.breathe() == "lungs"));
		System.out.println();

		// #5
		System.out.println("List only those animals that breath with lungs and were named in 1758\n");
		printAnimals(allAnimals, a -> (a.breathe() == "lungs") && (a.getYear() == 1758));
		System.out.println();

		// #6
		System.out.println("List only those animals that lay eggs and breath with lungs\n");
		printAnimals(allAnimals, a -> (a.reproduce() == "eggs") && (a.breathe() == "lungs"));
		System.out.println();

		// #7
		System.out.println("List alphabetically only those animals that were named in 1758\n");
		allAnimals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		printAnimals(allAnimals, a -> a.getYear() == 1758);
		System.out.println();

		// Stretch

		System.out.println("For the list of animals, list alphabetically those animals that are mammals");
		allAnimals.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		printAnimals(allAnimals, a -> (a instanceof Mammals));
		System.out.println();


	}



}

















