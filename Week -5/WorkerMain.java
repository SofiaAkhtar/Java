// Demonstrate constructor overloading with an example of employee class to print different details of an employee 
// based on the parameters passed.

class Worker {
    private String workerName;
    private int workerId;
    private double monthlySalary;

    public Worker(String workerName, int workerId) {
        this.workerName = workerName;
        this.workerId = workerId;
    }

    public Worker(String workerName, int workerId, double monthlySalary) {
        this.workerName = workerName;
        this.workerId = workerId;
        this.monthlySalary = monthlySalary;
    }

    public void showDetails() {
        System.out.println("Worker ID: " + workerId);
        System.out.println("Name: " + workerName);
        if (monthlySalary != 0) {
            System.out.println("Monthly Salary: $" + monthlySalary);
        }
        System.out.println("---------------------");
    }
}

public class WorkerMain {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Alice Anderson", 201);
        Worker worker2 = new Worker("Bob Brown", 202, 4500);

        worker1.showDetails();
        worker2.showDetails();
    }
}
