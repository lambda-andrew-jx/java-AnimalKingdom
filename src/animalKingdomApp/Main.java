package animalKingdomApp;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Mammal tiger = new Mammal("panda", 1869);
		Mammal zebra = new Mammal("zebra", 1778);
		Mammal koala = new Mammal("koala", 1816);
		Mammal sloth = new Mammal("sloth", 1804);
		Mammal armadillo = new Mammal("armadillo", 1758);
		Mammal raccoon = new Mammal("raccoon", 1758);
		Mammal bigfoot = new Mammal("bigfoot", 2021);

		Bird pigeon = new Bird("pigeon", 1837);
		Bird peacock = new Bird("peacock", 1821);
		Bird toucan = new Bird("toucan", 1758);
		Bird parrot = new Bird("parrot", 1824);
		Bird swan = new Bird("swan", 1758);

		Fish salmon = new Fish("salmon", 1758);
		Fish catfish = new Fish("catfish", 1817);
		Fish perch = new Fish("perch", 1758);

		System.out.println(tiger.move());
		System.out.println(tiger.breath());
		System.out.println(tiger.reproduce());

		List<Animal> animals = new ArrayList<Animal>();

		animals.add(tiger);
		animals.add(zebra);
		animals.add(koala);
		animals.add(sloth);
		animals.add(armadillo);
		animals.add(raccoon);
		animals.add(bigfoot);

		animals.add(pigeon);
		animals.add(peacock);
		animals.add(toucan);
		animals.add(parrot);
		animals.add(swan);

		animals.add(salmon);
		animals.add(catfish);
		animals.add(perch);

		System.out.println(animals.get(0).getName());
		System.out.println(animals.get(1).getName());
		System.out.println(animals.get(2).getName());

		// By year named
		animals.sort( (a1, a2) -> a1.getYearDiscovered() - a2.getYearDiscovered() );

		System.out.println("\n***Year Named***");
    animals.forEach((a) -> System.out.println(a.getYearDiscovered()));

    // Alphabetically
    animals.sort( (a1, a2) -> a1.getName().compareTo(a2.getName()) );

		System.out.println("\n***Alphabetical***");
    animals.forEach((a) -> System.out.println(a.getName()));

    // Movement
    animals.sort( (a1, a2) -> a1.move().compareTo(a2.move()) );

		System.out.println("\n***Movement***");
    animals.forEach((a) -> System.out.println(a.move()));

    // Breath with lungs
    List animalsWithLungs = new ArrayList<Animal>(
    	
    );
    
    animalsWithLungs.sort( (a1, a2) ->	a1.breath().compareTo(a2.breath()) );

		System.out.println("\n***Movement***");
    animalsWithLungs.forEach((a) -> System.out.println(a.breath()));

    // Breath with lungs and were named in 1758

    // Lay eggs and breath with lungs
 
 		// Named in 1758

	}	
}
