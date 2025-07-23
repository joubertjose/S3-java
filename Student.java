package javalabs;

import java.util.Scanner;

public class Student {
	String name;
    int age;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        Student student1 = new Student();

        System.out.print("Enter student's name: ");
        student1.name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        student1.age = scanner.nextInt();

        System.out.println("\nStudent Details:");
        student1.displayDetails();

        scanner.close();
    }
}

	
