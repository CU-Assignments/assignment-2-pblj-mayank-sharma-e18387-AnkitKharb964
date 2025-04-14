import java.util.Scanner;

// Abstract base class
abstract class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Abstract method that must be implemented in subclasses
    abstract void displayDetails();
}

// Fiction subclass
class Fiction extends Book {
    Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    void displayDetails() {
        System.out.println("\nFiction Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
}

// NonFiction subclass
class NonFiction extends Book {
    NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
}

// Main class
public class Assignment2P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Book 1 input
        System.out.print("Enter type (Fiction/NonFiction): ");
        String type1 = scanner.nextLine();
        System.out.print("Enter title: ");
        String title1 = scanner.nextLine();
        System.out.print("Enter author: ");
        String author1 = scanner.nextLine();
        System.out.print("Enter price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); // clear buffer

        // Book 2 input
        System.out.print("\nEnter type (Fiction/NonFiction): ");
        String type2 = scanner.nextLine();
        System.out.print("Enter title: ");
        String title2 = scanner.nextLine();
        System.out.print("Enter author: ");
        String author2 = scanner.nextLine();
        System.out.print("Enter price: ");
        double price2 = scanner.nextDouble();

        // Creating book objects
        Book book1 = type1.equalsIgnoreCase("Fiction") ?
                new Fiction(title1, author1, price1) :
                new NonFiction(title1, author1, price1);

        Book book2 = type2.equalsIgnoreCase("Fiction") ?
                new Fiction(title2, author2, price2) :
                new NonFiction(title2, author2, price2);

        // Display book details
        book1.displayDetails();
        book2.displayDetails();

        scanner.close();
    }
}
