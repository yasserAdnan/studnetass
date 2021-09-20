package main;

import helpers.OperationClass;
import menu.MenuItems;

public class CoreApplication {

    public static void main(String[] args) {
        int option = 3;
        do {
            System.out.println("\n\n                Welcome To Students System... \n");
            MenuItems.displayMenu();
            option = OperationClass.scanner.nextInt();
            switch (option) {
                case 1:
                    OperationClass.addStudent();
                    break;
                case 2:
                    OperationClass.removeStudent();
                    break;
                case 3:
                    OperationClass.addCourse();
                    break;
                case 4:
                    OperationClass.removeCourse();
                    break;
                case 5:
                    OperationClass.displayStudentInfo();
                    break;
                case 6:
                    OperationClass.displayAllStudentsMArkInfo();
                    break;
                case 7:
                    System.out.println("Have a nice day, Good Bye ...");
                    break;
                default:
                    System.out.println("Invalid Option Please Enter again!");
            }

        } while (option != 7);

    }


}
