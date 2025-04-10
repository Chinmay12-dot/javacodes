public class Book {
    String title;
    String author;
    int pages;

    // Constructor with title only
    public Book(String t) {
        title = t;
        author = "Unknown";
        pages = 0;
    }

    // Constructor with title and author
    public Book(String t, String a) {
        title = t;
        author = a;
        pages = 0;
    }

    // Constructor with all fields
    public Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book("OOP in Java", "James");
        Book b3 = new Book("Advanced Java", "Emily", 450);

        b1.display();
        b2.display();
        b3.display();
    }
}
