import java.util.*;

abstract class Product {
    private int id;
    private String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract void getDetails();

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

class Electronics extends Product {
    private int warranty;

    public Electronics(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    public void getDetails() {
        System.out.println("Electronics: " + getName() +
                ", Price: Rs." + price +
                ", Warranty: " + warranty + " years");
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(int id, String name, double price, String size) {
        super(id, name, price);
        this.size = size;
    }

    public void getDetails() {
        System.out.println("Clothing: " + getName() +
                ", Price: Rs." + price +
                ", Size: " + size);
    }
}

class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("electronics")) {
            return new Electronics(1, "Laptop", 50000, 2);
        } else if (type.equalsIgnoreCase("clothing")) {
            return new Clothing(2, "T-Shirt", 800, "M");
        }
        return null;
    }
}

class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product p) {
        items.add(p);
        System.out.println(p.getName() + " added to cart!");
    }

    public void showCart() {
        System.out.println("--- Cart Items ---");
        for (Product p : items) {
            p.getDetails();
        }
    }

    public double getTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}

interface PaymentStrategy {
    void pay(double amount);
}

class UPIPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI");
    }
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via Credit Card");
    }
}

class CashOnDelivery implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Rs." + amount + " will be paid on delivery");
    }
}

public class SmartShoppingSystem {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product p1 = ProductFactory.createProduct("electronics");
        Product p2 = ProductFactory.createProduct("clothing");

        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.showCart();

        double total = cart.getTotal();
        System.out.println("Total Amount: Rs." + total);

        PaymentStrategy payment = new UPIPayment();
        payment.pay(total);
    }
}