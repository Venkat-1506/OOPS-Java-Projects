import java.util.*;

interface VehicleOperations {
    void start();
    void stop();
    void calculateMileage();
}

class Vehicle {
    protected String brand;
    protected int speed;
    static int vehicleCount = 0;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        vehicleCount++;
    }

    public final void showCategory() {
        System.out.println("Category: Transport Vehicle");
    }

    public static void showVehicleCount() {
        System.out.println("Total Vehicles Created: " + vehicleCount);
    }
}

class Car extends Vehicle implements VehicleOperations {
    private int seats;

    public Car(String brand, int speed, int seats) {
        super(brand, speed);
        this.seats = seats;
    }

    public void start() {
        System.out.println(brand + " Car is Starting...");
    }

    public void stop() {
        System.out.println(brand + " Car is Stopping...");
    }

    public void calculateMileage() {
        System.out.println("Mileage: 18 km/l");
    }

    public void displayDetails() {
        System.out.println("Vehicle Type: Car");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Seats: " + seats);
    }
}

class Bike extends Vehicle implements VehicleOperations {
    private boolean helmetRequired;

    public Bike(String brand, int speed, boolean helmetRequired) {
        super(brand, speed);
        this.helmetRequired = helmetRequired;
    }

    public void start() {
        System.out.println(brand + " Bike is Starting...");
    }

    public void stop() {
        System.out.println(brand + " Bike is Stopping...");
    }

    public void calculateMileage() {
        System.out.println("Mileage: 45 km/l");
    }

    public void displayDetails() {
        System.out.println("Vehicle Type: Bike");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Helmet Required: " + helmetRequired);
    }
}

public class Vechicle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Enter Choice: ");
        int choice = s.nextInt();
        s.nextLine();

        System.out.print("Enter Brand: ");
        String brand = s.nextLine();

        System.out.print("Enter Speed: ");
        int speed = s.nextInt();

        VehicleOperations v;

        if (choice == 1) {
            System.out.print("Enter Number of Seats: ");
            int seats = s.nextInt();
            v = new Car(brand, speed, seats);
        } else {
            System.out.print("Helmet Required (true/false): ");
            boolean helmet = s.nextBoolean();
            v = new Bike(brand, speed, helmet);
        }

        v.start();
        v.calculateMileage();
        v.stop();

        Vehicle.showVehicleCount();

        s.close();
    }
}