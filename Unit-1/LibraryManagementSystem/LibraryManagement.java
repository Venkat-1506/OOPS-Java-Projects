import java.util.*;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Books:");

        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
	    System.out.println("Enter Book Details:");
            String input = sc.nextLine();
            String[] data = input.split(" ");

            String id = data[0];
            String title = data[1];
            String author = data[2];
            String shelf = data[3];
            String condition = data[4];

            books[i] = new Book(id, title, author, shelf, condition);
        }

        for (int i = 0; i < n; i++) {
            books[i].display();
        }

        sc.close();
    }
}
