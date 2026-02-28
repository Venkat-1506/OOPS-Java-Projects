import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        AccountDetails details = new AccountDetails(accNo, name);
        BankAccount account = new BankAccount(details, 0);
        BankServiceImpl service = new BankServiceImpl(account);

        int choice;
        double amount;

        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Show Balance 4.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    service.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();
                    service.withdraw(amount);
                    break;

                case 3:
                    service.showBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}