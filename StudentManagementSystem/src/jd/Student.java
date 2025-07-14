package jd;

import java.util.*;

public class Student {
    private static int idCounter = 10000;
    private String name;
    private String studentId;
    private ArrayList<String> courses = new ArrayList<>();
    private int balance = 0;

    private static final Map<String, Integer> COURSE_FEES = Map.of(
        "Math 101", 2000,
        "English 101", 1500,
        "Computer Science 101", 3000
    );

    public Student(String name) {
        this.name = name;
        this.studentId = generateStudentId();
    }

    private String generateStudentId() {
        return String.valueOf(++idCounter);
    }

    public void enroll(String course) {
        if (COURSE_FEES.containsKey(course)) {
            courses.add(course);
            balance += COURSE_FEES.get(course);
        } else {
            System.out.println("Course not available: " + course);
        }
    }

    public void viewBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    public void payTuition(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount.");
            return;
        }
        balance -= amount;
        System.out.println("Payment of ₹" + amount + " received.");
    }

    public void showStatus() {
        System.out.println("\n------ Student Status ------");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Courses Enrolled: " + courses);
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCoursesAsString() {
        return String.join(", ", courses);
    }

    public int getBalance() {
        return balance;
    }
}
