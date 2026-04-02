import java.util.*;

interface Vehicle {
    void rent();
}

class Car implements Vehicle {
    public void rent() {
        System.out.println("Car rented - Comfortable for family trips.");
    }
}

class Bike implements Vehicle {
    public void rent() {
        System.out.println("Bike rented - Best for solo rides.");
    }
}

class Truck implements Vehicle {
    public void rent() {
        System.out.println("Truck rented - Suitable for heavy transport.");
    }
}

class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        } else {
            System.out.println("Invalid vehicle type!");
            return null;
        }
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (Car/Bike/Truck): ");
        String type = sc.nextLine();

        Vehicle vehicle = VehicleFactory.getVehicle(type);
        if (vehicle != null) {
            vehicle.rent();
        }

        sc.close();
    }
}