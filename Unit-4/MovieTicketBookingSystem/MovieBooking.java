package MovieTicketBookingSystem;
import java.util.*;

class Booking {
    String movieName;
    String customerName;
    int seats;

    Booking(String movieName, String customerName, int seats) {
        this.movieName = movieName;
        this.customerName = customerName;
        this.seats = seats;
    }

    public String toString() {
        return "Movie Name: " + movieName +
               "\nCustomer Name: " + customerName +
               "\nSeats Booked: " + seats + "\n";
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Booking> list = new ArrayList<>();

        try {
            System.out.print("Enter number of bookings: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Movie Name: ");
                String movie = sc.nextLine();

                System.out.print("Enter Customer Name: ");
                String customer = sc.nextLine();

                System.out.print("Enter Number of Seats: ");
                int seats = sc.nextInt();
                sc.nextLine();

                list.add(new Booking(movie, customer, seats));
            }

            System.out.println("\nBooking Details:");
            for (Booking b : list) {
                System.out.println(b);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct data.");
        } finally {
            sc.close();
        }
    }
} 