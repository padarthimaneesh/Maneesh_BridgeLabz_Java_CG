package objectorientedprogramming.keywordandoperator.level1;
class Book {

    // Static
    static String libraryName = "Central Library";

    // Final
    final String isbn;

    // Instance variables
    String title;
    String author;

    // Constructor using this
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display(Object obj) {
        if (obj instanceof Book) {
            System.out.println(title + " | " + author + " | " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James Gosling", "ISBN123");
        displayLibraryName();
        b.display(b);
    }
}
