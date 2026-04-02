import java.util.*;

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

class UPIPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

class CashOnDelivery implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Payment of Rs." + amount + " will be collected on delivery.");
    }
}

class Order {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int amount) {
        if (strategy == null) {
            System.out.println("Select a payment method!");
        } else {
            strategy.pay(amount);
        }
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        System.out.println("----- Food Menu -----");
        System.out.println("1. Pizza - Rs.200");
        System.out.println("2. Burger - Rs.100");
        System.out.println("3. Pasta - Rs.150");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        int amount = 0;

        switch (choice) {
            case 1: amount = 200; break;
            case 2: amount = 100; break;
            case 3: amount = 150; break;
            default: System.out.println("Invalid choice!");
        }

        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash on Delivery");

        int paymentChoice = sc.nextInt();

        switch (paymentChoice) {
            case 1:
                order.setPaymentStrategy(new CreditCardPayment());
                break;
            case 2:
                order.setPaymentStrategy(new UPIPayment());
                break;
            case 3:
                order.setPaymentStrategy(new CashOnDelivery());
                break;
            default:
                System.out.println("Invalid payment option!");
        }

        order.processOrder(amount);
        sc.close();
    }
}