package objectorientedprogramming.inheritance.Single_Inheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        System.out.println("Book Title : " + title);
        System.out.println("Year       : " + publicationYear);
        System.out.println("Author     : " + name);
        System.out.println("Bio        : " + bio);
    }
}

public class BookAuthorDemo {
    public static void main(String[] args) {
        Author author = new Author(
                "Java Programming",
                2023,
                "James Gosling",
                "Father of Java"
        );

        author.displayInfo();
    }
}
