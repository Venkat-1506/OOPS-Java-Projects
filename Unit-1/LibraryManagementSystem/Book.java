class Book {
    String id;
    String title;
    String author;
    String shelf;
    String condition;

    Book(String id, String title, String author, String shelf, String condition) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.shelf = shelf;
        this.condition = condition;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Shelf: " + shelf);
        System.out.println("Condition: " + condition);
        System.out.println();
    }
}