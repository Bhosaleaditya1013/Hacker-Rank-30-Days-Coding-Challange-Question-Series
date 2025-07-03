// Given a Book class and a Solution class, write a MyBook class that does the following:

// Inherits from Book


import java.util.*;

// Abstract class
abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Abstract method to be implemented
    abstract void display();
}

// Subclass that extends Book
class MyBook extends Book {
    int price;

    // Constructor
    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    // Implement the abstract method
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Main class
public class Day13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book myBook = new MyBook(title, author, price);
        myBook.display();
    }
}
