class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Lion extends Animal {
    public void roar() {
        System.out.println("Lion is roaring");
    }
}

class Elephant extends Animal {
    public void trumpet() {
        System.out.println("Elephant is trumpeting");
    }
}

class Monkey extends Animal {
    public void swing() {
        System.out.println("Monkey is swinging on a tree");
    }
}

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Elephant elephant = new Elephant();
        Monkey monkey = new Monkey();

        System.out.println("Lion:");
        lion.eat();
        lion.sleep();
        lion.roar();

        System.out.println("\nElephant:");
        elephant.eat();
        elephant.sleep();
        elephant.trumpet();

        System.out.println("\nMonkey:");
        monkey.eat();
        monkey.sleep();
        monkey.swing();
    }
}
