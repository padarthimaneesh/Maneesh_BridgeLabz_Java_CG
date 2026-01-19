package objectorientedprogramming.classandobject.level1;
/*
Program to Handle Book Details
Problem Statement:
Create a Book class with attributes title, author, and price.
Add a method to display book details.
*/

class BookDetails {
    private String title;
    private String author;
    private double price;

    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
    }
}

public class Book {
    public static void main(String[] args) {
        BookDetails book = new BookDetails("Java Basics", "James Gosling", 499);
        book.displayDetails();
    }
}