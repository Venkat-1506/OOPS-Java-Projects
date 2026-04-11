import java.util.*;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "Product Name: " + name + "\nQuantity: " + quantity + "\n";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Product> stock = new HashMap<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine();

            stock.put(id, new Product(name, qty));
        }

        System.out.println("\nInventory Details:");
        for (Map.Entry<Integer, Product> entry : stock.entrySet()) {
            System.out.println("Product ID: " + entry.getKey());
            System.out.println(entry.getValue());
        }

        sc.close();
    }
}