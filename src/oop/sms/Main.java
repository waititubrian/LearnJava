package oop.sms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number (e.g., 1 to 5).");
                continue;
            }

            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    Student newStudent = new Student(id, name, course, gpa);
                    manager.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    manager.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID to search: ");
                    String searchId = scanner.nextLine();
                    Student found = manager.findStudentById(searchId);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    if (manager.removeStudent(deleteId)) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
