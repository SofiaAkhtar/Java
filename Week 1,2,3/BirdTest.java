abstract class Bird {
    public abstract void fly();

    public abstract void sing();
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying.");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow is singing.");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguin cannot fly.");
    }

    @Override
    public void sing() {
        System.out.println("Penguin is singing underwater.");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        sparrow.fly();
        sparrow.sing();

        penguin.fly();
        penguin.sing();
    }
}
