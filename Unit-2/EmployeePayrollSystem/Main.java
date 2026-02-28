import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        EmployeeDetails emp = new EmployeeDetails(id, name);

        int choice;
        double basic, allowance, deduction;

        do {
            System.out.println("\n1.Calculate Salary 2.Display Payroll 3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Basic Pay: ");
                basic = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Allowance: ");
                allowance = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Deduction: ");
                deduction = sc.nextDouble();
                sc.nextLine();

                Payroll payroll = new Payroll(basic, allowance, deduction);
                PayrollServiceImpl service = new PayrollServiceImpl(emp, payroll);
                System.out.println("Salary calculated successfully.");
            }
            else if (choice == 2) {
                Payroll payroll = new Payroll(30000, 5000, 2000);
                PayrollServiceImpl service = new PayrollServiceImpl(emp, payroll);
                service.showPayroll();
            }

        } while (choice != 3);

        System.out.println("Thank you!");
        sc.close();
    }
}