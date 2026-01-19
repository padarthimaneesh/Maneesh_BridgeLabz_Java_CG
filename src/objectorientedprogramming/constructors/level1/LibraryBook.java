package objectorientedprogramming.constructors.level1;
class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    void display() {
        System.out.println(title + " | " + author + " | Available: " + availability);
    }

    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("OOP in Java", "Herbert Schildt", 550);

        lb.display();
        lb.borrowBook();
        lb.display();
    }
}
