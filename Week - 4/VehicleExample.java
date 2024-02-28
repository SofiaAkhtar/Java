//Implement a class hierarchy for different types of vehicles, including Car, Bicycle, and Motorcycle.
// Include common properties like speed and methods like start and stop.

class Vehicle {
    protected String type;
    protected int speed;

    public Vehicle(String type) {
        this.type = type;
        this.speed = 0;
    }

    public void start() {
        System.out.println(type + " is starting.");
        speed = 5; // Default speed when starting
    }

    public void stop() {
        System.out.println(type + " is stopping.");
        speed = 0;
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println(type + " is accelerating. Current speed: " + speed + " km/h");
    }

    public void decelerate(int amount) {
        speed -= amount;
        System.out.println(type + " is decelerating. Current speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    public Car() {
        super("Car");
    }

    public void drift() {
        System.out.println("Car is drifting.");
    }
}

class Bicycle extends Vehicle {
    public Bicycle() {
        super("Bicycle");
    }

    public void ringBell() {
        System.out.println("Bicycle is ringing the bell.");
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle() {
        super("Motorcycle");
    }

    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie.");
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate(20);
        car.drift();
        car.decelerate(10);
        car.stop();

        System.out.println();

        Bicycle bicycle = new Bicycle();
        bicycle.start();
        bicycle.ringBell();
        bicycle.accelerate(15);
        bicycle.decelerate(5);
        bicycle.stop();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.wheelie();
        motorcycle.accelerate(30);
        motorcycle.decelerate(15);
        motorcycle.stop();
    }
}
