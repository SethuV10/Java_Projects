package jd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Student Enrollment System ====");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student student = new Student(name);

        System.out.println("\nAvailable Courses:");
        System.out.println("1. Math 101 - ₹2000");
        System.out.println("2. English 101 - ₹1500");
        System.out.println("3. Computer Science 101 - ₹3000");

        System.out.print("\nEnter courses to enroll (comma-separated): ");
        String[] selectedCourses = sc.nextLine().split(",");

        for (String course : selectedCourses) {
            student.enroll(course.trim());
        }

        student.viewBalance();

        System.out.print("\nEnter amount to pay: ₹");
        int payment = sc.nextInt();
        student.payTuition(payment);

        student.showStatus();

        // Save to database
        StudentDatabase.insertStudent(student);

        sc.close();
    }
}
