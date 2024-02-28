//Design a system with a base class Employee and derived classes Manager, Developer, and Tester. 
//Use polymorphism to calculate the total salary of a team.

class Staff {
    private String name;
    private double baseSalary;

    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class Supervisor extends Staff {
    private double bonus;

    public Supervisor(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }
}

class Coder extends Staff {
    private double overtimePay;

    public Coder(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + overtimePay;
    }
}

class TesterPerson extends Staff {
    private double performanceBonus;

    public TesterPerson(String name, double baseSalary, double performanceBonus) {
        super(name, baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + performanceBonus;
    }
}

class WorkTeam {
    private Staff[] members;

    public WorkTeam(Staff... members) {
        this.members = members;
    }

    public double calculateTotalPay() {
        double totalPay = 0;
        for (Staff member : members)
            totalPay += member.calculatePay();
        return totalPay;
    }
}

public class WorkMain {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor("Alice Doe", 55000, 12000);
        Coder coder = new Coder("Bob Smith", 45000, 6000);
        TesterPerson tester = new TesterPerson("Charlie Johnson", 50000, 8000);

        WorkTeam team = new WorkTeam(supervisor, coder, tester);
        System.out.println("Total Team Pay: $" + team.calculateTotalPay());
    }
}
