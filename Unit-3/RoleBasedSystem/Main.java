package RoleBasedSystem;
import java.util.*;

class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayRole() {
        System.out.println("Employee Details");
    }
}

class Trainer extends Employee {
    private String course;

    public Trainer(String name, int id, String course) {
        super(name, id);
        this.course = course;
    }

    public void displayRole() {
        System.out.println("--- Trainer Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Teaches: " + course);
    }
}

class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);
    }

    public void displayRole() {
        System.out.println("--- Manager Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: Manages Employees");
    }
}

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void calculateInterest() {
        System.out.println("Interest calculation");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Savings Interest (5%): " + interest);
    }
}

class SalaryAccount extends Account {
    public SalaryAccount(double balance) {
        super(balance);
    }

    public void calculateInterest() {
        System.out.println("Salary Account: No Interest");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Select Employee Type (1-Trainer, 2-Manager): ");
        int choice = s.nextInt();
        s.nextLine();

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter ID: ");
        int id = s.nextInt();
        s.nextLine();

        Employee emp;

        if (choice == 1) {
            System.out.print("Enter Course Teaching: ");
            String course = s.nextLine();
            emp = new Trainer(name, id, course);
        } else {
            emp = new Manager(name, id);
        }

        emp.displayRole();

        System.out.print("Select Account Type (1-Savings, 2-Salary): ");
        int accType = s.nextInt();

        System.out.print("Enter Balance: ");
        double balance = s.nextDouble();

        Account acc;

        if (accType == 1) {
            acc = new SavingsAccount(balance);
        } else {
            acc = new SalaryAccount(balance);
        }

        acc.calculateInterest();

        s.close();
    }
}