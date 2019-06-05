package kingdom;

import java.util.*;

public class Main
{
	public static void printAnimals(ArrayList<Animal> animal, CheckAnimals tester)
    {
        for (Animal a : animal)
        {
            if(tester.test(a))
            {
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

		System.out.println("List all the animals in descending order by year named");
		// allAnimals.sort((o1, o2) -> o1.getYear() - o2.getYear());
		// printAnimals(allAnimals, a -> true);
	}
}