import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    // Constructor to initialize the Product
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display the product details
    void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Price : ₹" + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting and reading input for Product
        System.out.print("Enter Product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // To consume the newline after nextInt()

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Product Price: ₹");
        double price = scanner.nextDouble();

        // Create the Product object and display its details
        Product p = new Product(id, name, price);
        p.displayDetails();

        scanner.close();  // Closing the scanner
    }
}
