import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //  Type       Variable Name     Type
        //    |           |               |
        //    v           v               v
        // KeywordExample obj = new KeywordExample();

        // Type = Fish
        // Variable Name = fish1

        ArrayList<AbstractAnimal> animals = new ArrayList<>();

        Mammals mammals1 = new Mammals("Zebra", 1778);
        Mammals mammals2 = new Mammals("Koala", 1816);
        Mammals mammals3 = new Mammals("Sloth", 1804);
        Mammals mammals4 = new Mammals("Armadillo", 1758);
        Mammals mammals5 = new Mammals("Raccoon", 1758);
        Mammals mammals6 = new Mammals("Bigfoot", 2021);

        Bird bird1 = new Bird("Pigeon", 1837);
        Bird bird2 = new Bird("Peacock", 1821);
        Bird bird3 = new Bird("Toucan", 1758);
        Bird bird4 = new Bird("Parrot", 1824);
        Bird bird5 = new Bird("Swan", 1758);

        Fish fish1 = new Fish("Salmon", 1758);
        Fish fish2 = new Fish("Catfish", 1817);
        Fish fish3 = new Fish("Perch", 1758);


        animals.add(mammals1);
        animals.add(mammals2);
        animals.add(mammals3);
        animals.add(mammals4);
        animals.add(mammals5);
        animals.add(mammals6);

        animals.add(bird1);
        animals.add(bird2);
        animals.add(bird3);
        animals.add(bird4);
        animals.add(bird5);

        animals.add(fish1);
        animals.add(fish2);
        animals.add(fish3);

//animals.sort(Comparator.comparing(AbstractAnimal::getYear));


        //List all the animals in descending order by year named
        System.out.println("------------Lambda Functions No1----------------");
        animals.sort((a1, a2) -> a1.getYear() - a2.getYear());
        animals.forEach(animal -> System.out.println(animal.getName() + animal.getYear()));

        //List all the animals alphabetically
        System.out.println("---------------Lambda Functions No2---------------");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach(animal -> System.out.println(animal.getName()));

        //List all the animals order by how they move
        System.out.println("-------------Lambda Functions No3------------------");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach(animal -> System.out.println(animal.getName() + animal.move()));

        //List only those animals the breath with lungs
        System.out.println("--------------Lambda Functions No4-----------------");
        animals.stream().filter(animal -> animal.breath() == "lungs").forEach(animal -> System.out.println(animal.getName()));

        //List only those animals that breath with lungs and were named in 1758
        System.out.println("---------------Lambda Functions No5------------------");
        animals.stream().filter(animal -> animal.getYear() == 1758 && animal.breath() == "lungs").forEach(animal -> System.out.println(animal.getName()));

        //List only those animals that lay eggs and breath with lungs
        System.out.println("-----------------Lambda Functions No6--------------------");
        animals.stream().filter(animal -> animal.reproduce() == "eggs" && animal.breath() == "lungs").forEach(animal -> System.out.println(animal.getName()));

        //List alphabetically only those animals that were named in 1758
        System.out.println("------------------Lambda Functions No7-------------------");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.stream().filter(animal -> animal.getYear() == 1758).forEach(animal -> System.out.println(animal.getName()));

        //Stretch Goal     /For the list of animals, list alphabetically those animals that are mammals.
        System.out.println("------------Stretch Goal---------------");
        animals.sort((a1,a2)-> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.stream().filter(animal-> animal.getClass().getName()=="Mammals").forEach(animal-> System.out.println(animal.getName()));


    }

}

