//Implement a class EmployeeRegistry that manages a list of employees. Use polymorphism to display details like name
// and role for each employee.
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String department) {
        super(name, "Manager");
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("---------------------");
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String programmingLanguage) {
        super(name, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("---------------------");
    }
}

class EmployeeRegistry {
    private Employee[] employees;

    public EmployeeRegistry(Employee[] employees) {
        this.employees = employees;
    }

    public void displayAllDetails() {
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Manager("John Doe", "Human Resources"),
                new Developer("Jane Smith", "Java"),
                new Developer("Bob Johnson", "Python")
        };

        EmployeeRegistry employeeRegistry = new EmployeeRegistry(employees);
        employeeRegistry.displayAllDetails();
    }
}
