import java.util.*;

class Product {
    protected int id;
    protected String name;
    protected double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product: " + name + ", Price: Rs." + price);
    }

    public double getPrice() {
        return price;
    }
}

class Electronics extends Product {
    private int warranty;

    public Electronics(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    public void displayDetails() {
        System.out.println("Electronics: " + name +
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

    public void displayDetails() {
        System.out.println("Clothing: " + name +
                ", Price: Rs." + price +
                ", Size: " + size);
    }
}

class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added to cart!");
    }

    public void showCart() {
        System.out.println("\n--- Cart Items ---");
        for (Product p : products) {
            p.displayDetails();
        }
    }

    public void calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        System.out.println("Total Amount: Rs." + total);
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product p1 = new Electronics(1, "Laptop", 50000, 2);
        Product p2 = new Clothing(2, "T-Shirt", 800, "M");

        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.showCart();
        cart.calculateTotal();
    }
}