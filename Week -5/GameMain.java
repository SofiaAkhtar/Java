//Design a game with a base class GameCharacter and subclasses for different character types. 
//Use polymorphism to handle interactions between characters

class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " took " + damage + " damage. Remaining health: " + health);
        }
    }

    public void attack(GameCharacter target) {
        System.out.println(name + " attacks " + target.getName());
        target.takeDamage(10); // Assuming a fixed damage value for simplicity
    }
}

class PlayerCharacter extends GameCharacter {
    private int experience;

    public PlayerCharacter(String name, int health, int experience) {
        super(name, health);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        System.out.println("Player-specific damage handling logic can be added here.");
    }
}

class EnemyCharacter extends GameCharacter {
    public EnemyCharacter(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter target) {
        super.attack(target);
        System.out.println("Enemy-specific attack logic can be added here.");
    }
}

public class GameMain {
    public static void main(String[] args) {
        PlayerCharacter player = new PlayerCharacter("Player1", 100, 0);
        EnemyCharacter enemy = new EnemyCharacter("Enemy1", 50);

        player.attack(enemy);
        enemy.attack(player);
    }
}
