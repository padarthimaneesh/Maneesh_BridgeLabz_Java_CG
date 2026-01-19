package objectorientedprogramming.accessmodifiers;
class Book {
    public String ISBN;           // public
    protected String title;       // protected
    private String author;        // private

    // Setter and Getter for private variable
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends Book {
    void displayDetails() {
        System.out.println("ISBN   : " + ISBN);    // public
        System.out.println("Title  : " + title);   // protected
        System.out.println("Author : " + getAuthor());
    }

    public static void main(String[] args) {
        EBook eb = new EBook();
        eb.ISBN = "ISBN12345";
        eb.title = "Java Basics";
        eb.setAuthor("James Gosling");

        eb.displayDetails();
    }
}
