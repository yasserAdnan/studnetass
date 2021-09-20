package menu;

public class MenuItems {

    static final String[] MENU_ITEMS = {
            "add Student",
            "remove Student",
            "Add Course",
            "Remove Course",
            "display the list of student name with the marks.",
            "display the list of student names with the marks and max/min/avg.",
            "exit the program"};

    static final String PROMPT_STAT = "\nPlease Enter Your Option: ";

    public static void displayMenu() {
        System.out.println("\n\n\n");

        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.println((i + 1) + " - " + MENU_ITEMS[i]);
        }

        System.out.println(PROMPT_STAT);
    }

}
