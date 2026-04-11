package LibraryManagementSystem;
import java.util.*;

class Book {
    int id;
    String name;
    String author;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return "Book ID: " + id + "\nBook Name: " + name + "\nAuthor: " + author + "\n";
    }
}

class Library {
    ArrayList<Book> bookList = new ArrayList<>();

    void addBook(Book b) {
        bookList.add(b);
    }

    void displayBooks() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        try {
            System.out.print("Enter number of books: ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Book Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                lib.addBook(new Book(id, name, author));
            }

            System.out.println("\nLibrary Book List:");
            lib.displayBooks();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Enter correct data.");
        } finally {
            sc.close();
        }
    }
}