package helpers;

import entites.Course;
import entites.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class OperationClass {

    public static Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> students = new ArrayList<>();

    public static void addCourse() {
        displayStudentInfo();

        System.out.println("Enter Student Number: ");
        int stuNum = scanner.nextInt();

        System.out.println("please Enter Course Name: ");
        String courseName = scanner.next();
        System.out.println("please Enter Course Mark: ");
        double courseMark = scanner.nextDouble();

        Course course = new Course(courseName, courseMark);

        boolean isCourseAdded = false;

        for (Student student : students) {
            if (student.getID() == stuNum) {
                student.addCourse(course);
                isCourseAdded = true;
            }
        }

        if (isCourseAdded) {
            System.out.println("Course added Successfully...");
        } else {
            System.out.println("Course Not Added because the student number: " + stuNum + " is wrong...");
        }
    }

    public static void removeCourse() {
        displayStudentInfo();

        System.out.println("Please Enter Student Number: ");
        int stuNum = scanner.nextInt();

        System.out.println("Please Enter Course Number: ");
        int courseNum = scanner.nextInt();

        boolean isCourseDeleted = false;

        for (Student student : students) {
            if (student.getID() == stuNum) {
                student.removeCourse(courseNum);
                isCourseDeleted = true;
            }
        }

        if (isCourseDeleted) {
            System.out.println("Course deleted Successfully...");
        } else {
            System.out.println("Course Not deleted because the student number: " + stuNum + " is wrong...");
        }
    }

    public static void addStudent() {
        System.out.println("         --- please Enter the Student Data --- \n");
        System.out.println("         --- please Enter Student Name --- \n");
        String name = scanner.next();
        Student student = new Student(name);
        students.add(student);
    }

    public static void removeStudent() {
        System.out.println("         --- please Enter Student Number --- \n");
        int id = scanner.nextInt();
        boolean isRemoved = false;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getID() == id) {
                students.remove(i);
                isRemoved = true;
                break;
            }
        }
        if (isRemoved) {
            System.out.println("Done...");
        } else {
            System.out.println("The id: " + id + " You Entered is Wrong");
        }
    }

    public static void displayStudentInfo() {
        if (students.isEmpty()) {
            System.out.println("There is NO Students...");
        }
        System.out.println("Number Of Students is :" + students.size());
        for (Student student : students) {
            System.out.println(student);
            System.out.println();
        }
    }

    public static void displayAllStudentsMArkInfo() {
        if (students.isEmpty()) {
            System.out.println("There is NO Students...");
        }

        System.out.println("Number Of Students is :" + students.size());
        for (Student student : students) {
            System.out.println(student);
            System.out.println("Max Course: " + (student.maxCourse() != null ? student.maxCourse() : "NO Courses"));
            System.out.println("Min Course: " + (student.minCourse() != null ? student.maxCourse() : "NO Courses"));
            double avg = student.avg();
            System.out.println("Course AVG : " + (avg != -1 ? avg : "NO Courses"));
            System.out.println();
        }
    }

}
