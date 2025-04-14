import java.util.Scanner;

abstract class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to display details
    abstract void displayDetails();
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

public class Assignment2P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading student details
        System.out.print("Enter Student Name: ");
        String sName = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int sAge = scanner.nextInt();
        System.out.print("Enter Student Roll Number: ");
        int roll = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Reading teacher details
        System.out.print("\nEnter Teacher Name: ");
        String tName = scanner.nextLine();
        System.out.print("Enter Teacher Age: ");
        int tAge = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter Teacher Subject: ");
        String subject = scanner.nextLine();

        // Create student and teacher objects
        Person student = new Student(sName, sAge, roll);
        Person teacher = new Teacher(tName, tAge, subject);

        // Display details
        student.displayDetails();
        teacher.displayDetails();

        scanner.close();  // Close scanner
    }
}
