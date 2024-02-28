//Design a class Employee with attributes like employeeId, name, and salary. Derive classes Manager 
//and Clerk with additional attributes.
class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(int employeeId, String name, double salary, String department) {

        super(employeeId, name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Clerk extends Employee {
    private String office;

    public Clerk(int employeeId, String name, double salary, String office) {

        super(employeeId, name, salary);
        this.office = office;
    }e

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager(101, "John Manager", 50000.0, "IT");
        Clerk clerk = new Clerk(201, "Alice Clerk", 30000.0, "Reception");

        System.out.println("Manager Department: " + manager.getDepartment());
        System.out.println("Clerk Office: " + clerk.getOffice());
    }
}
