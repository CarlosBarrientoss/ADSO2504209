package com.wspo;

import com.wspo.dao.StudentDao;
import com.wspo.domain.Student;
import com.wspo.factory.ConnectionFactory;

import java.util.Optional;
import java.util.Scanner;

public class SystemStudentApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentDao studentDao = new StudentDao(new ConnectionFactory());
        boolean keep = true;

        do {
            showMenu();
            keep = executeOptions(in, studentDao);
        } while (keep);
    }

    public static boolean executeOptions(Scanner in, StudentDao studentDao) {
        boolean keep = true;
        int option = Integer.parseInt(in.nextLine());

        switch (option) {
            case 1 -> {
                System.out.println("\nListing students");
                studentDao.list().forEach(System.out::println);
            }
            case 2 -> {
                System.out.print("\nEnter the student's id: ");
                int id = Integer.parseInt(in.nextLine());
                System.out.println("\nSearching student");
                boolean wasFound = studentDao.searchStudentById(id);
                if (wasFound) {
                    System.out.println("Student found");
                } else {
                    System.out.println("The student was not found");
                }
            }
            case 3 -> {
                System.out.println("\nEnter the following data from the student");
                System.out.print("Name: ");
                String name = in.nextLine();
                System.out.println("");

                System.out.print("Last Name: ");
                String lastName = in.nextLine();
                System.out.println("");

                System.out.print("Phone Number: ");
                String phoneNumber = in.nextLine();
                System.out.println("");

                System.out.print("Email: ");
                String email = in.nextLine();
                System.out.println("");

                Student student = new Student(name, lastName, phoneNumber, email);
                int idNewStudent = studentDao.addStudent(student);

                System.out.println(String.format("The student was registered with the id: %d", idNewStudent));
            }
            case 4 -> {
                System.out.println("\nEnter the following data from the student to update");
                System.out.print("Id: ");
                int id = Integer.parseInt(in.nextLine());
                System.out.println("");

                System.out.print("Name: ");
                String name = in.nextLine();
                System.out.println("");

                System.out.print("Last Name: ");
                String lastName = in.nextLine();
                System.out.println("");

                System.out.print("Phone Number: ");
                String phoneNumber = in.nextLine();
                System.out.println("");

                System.out.print("Email: ");
                String email = in.nextLine();
                System.out.println("");

                Student student = new Student(id, name, lastName, phoneNumber, email);
                boolean updateResult = studentDao.updateStudent(student);

                if (updateResult) {
                    System.out.println("Updated!!");
                } else {
                    System.out.println("Couldn't update the student");
                }
            }
            case 5 -> {
                System.out.println("\nEnter the following data from the student to delete");
                System.out.print("Id: ");
                int id = Integer.parseInt(in.nextLine());
                System.out.println("");

                boolean deleteResult = studentDao.deleteStudentById(id);

                if (deleteResult) {
                    System.out.println("Deleted!!");
                } else {
                    System.out.println("Couldn't delete the student");
                }
            }
            case 6 -> {
                System.out.print("\nEnter the student's id: ");
                int id = Integer.parseInt(in.nextLine());
                System.out.println("\nGetting student");
                Optional<Student> studentOptional = studentDao.getStudentById(id);
                boolean wasFound = studentOptional.isPresent();
                if (wasFound) {
                    Student student = studentOptional.get();
                    System.out.println(student);
                } else {
                    System.out.println("The student was not found");
                }
            }
            case 7 -> {
                System.out.println("\nGood Bye!!");
                keep = false;
            }
        }

        return keep;
    }

    public static void showMenu() {
        String menu = """
                
                ****  Student List  ****
                [1] List students
                [2] Search student
                [3] Add student
                [4] Update student
                [5] Delete student
                [6] Get Student by id
                [7] Exit
                
                Select an option: """;
        System.out.println(menu);
    }
}
