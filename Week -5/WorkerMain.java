// Demonstrate constructor overloading with an example of employee class to print different details of an employee 
// based on the parameters passed.

class Worker {
    private String workerName;
    private int workerId;
    private double monthlySalary;

    // Constructor with workerName and workerId parameters
    public Worker(String workerName, int workerId) {
        this.workerName = workerName;
        this.workerId = workerId;
    }

    // Constructor with workerName, workerId, and monthlySalary parameters
    public Worker(String workerName, int workerId, double monthlySalary) {
        this.workerName = workerName;
        this.workerId = workerId;
        this.monthlySalary = monthlySalary;
    }

    // Display method to print worker details
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
        // Create instances using different constructors
        Worker worker1 = new Worker("Alice Anderson", 201);
        Worker worker2 = new Worker("Bob Brown", 202, 4500);

        // Display details for each worker
        worker1.showDetails();
        worker2.showDetails();
    }
}
