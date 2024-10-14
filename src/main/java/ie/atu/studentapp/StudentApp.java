package ie.atu.studentapp;

import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect input for the first student
        System.out.println("Enter the name of student 1: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter the email of student 1: ");
        String email1 = scanner.nextLine();
        System.out.println("Enter the course of student 1: ");
        String course1 = scanner.nextLine();

        // Instance 1: Using the default constructor and setter methods
        Student student1 = new Student();
        student1.setName(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        // input for the second student
        System.out.println("\nEnter the name of student 2: ");
        String name2 = scanner.nextLine();
        System.out.println("Enter the email of student 2: ");
        String email2 = scanner.nextLine();
        System.out.println("Enter the course of student 2: ");
        String course2 = scanner.nextLine();

        // Instance 2: Using the constructor that accepts only the name, then setter methods for email and course
        Student student2 = new Student(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        //  input for third student
        System.out.println("\nEnter the name of student 3: ");
        String name3 = scanner.nextLine();
        System.out.println("Enter the email of student 3: ");
        String email3 = scanner.nextLine();
        System.out.println("Enter the course of student 3: ");
        String course3 = scanner.nextLine();

        // Instance 3: Using the constructor that accepts name, email, and course
        Student student3 = new Student(name3, email3, course3);

        // Print details
        System.out.println("\nStudent 1: Name: " + student1.getName() + ", Email: " + student1.getEmail() + ", Course: " + student1.getCourse());
        System.out.println("Student 2: Name: " + student2.getName() + ", Email: " + student2.getEmail() + ", Course: " + student2.getCourse());
        System.out.println("Student 3: Name: " + student3.getName() + ", Email: " + student3.getEmail() + ", Course: " + student3.getCourse());
        scanner.close();
    }
}