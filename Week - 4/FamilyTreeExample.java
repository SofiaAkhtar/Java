import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class FamilyTree {
    private List<Person> familyMembers;

    public FamilyTree() {
        this.familyMembers = new ArrayList<>();
    }

    public void addPerson(Person person) {
        familyMembers.add(person);
    }

    public void displayFamilyTree() {
        System.out.println("Family Tree:");
        for (Person person : familyMembers) {
            System.out.println(person);
        }
    }
}

public class FamilyTreeExample {
    public static void main(String[] args) {

        Person grandpa = new Person("Grandpa", 75);
        Person grandma = new Person("Grandma", 70);
        Person dad = new Person("Dad", 45);
        Person mom = new Person("Mom", 40);
        Person me = new Person("You", 25);

        FamilyTree familyTree = new FamilyTree();

        familyTree.addPerson(grandpa);
        familyTree.addPerson(grandma);
        familyTree.addPerson(dad);
        familyTree.addPerson(mom);
        familyTree.addPerson(me);

        familyTree.displayFamilyTree();

    }
}
