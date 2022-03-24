import java.util.*;

public class Menu {

    public Menu() {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int choice = 0;
        do {
            // System.out.print("\033[H\033[2J");
            // System.out.flush();
            System.out.println("Welcome to the main menu!");
            System.out.println("Please select an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. View all students");
            System.out.println("4. View a student");
            System.out.println("5. Sort students");
            System.out.println("0. Exit");
            System.out.println("Enter option : ");
            choice = input.nextInt();

            // System.out.println("choice is"+ choice);

            if (choice == 1) {
                System.out.println("Enter student name: ");
                String name = input.nextLine();
                name = input.nextLine();
                System.out.println("Enter student ID: ");
                String id = input.nextLine();
                System.out.println("Enter student mark: ");
                int mark = input.nextInt();
                students.add(new Student(name, id, mark));
            }
            if (choice == 2) {
                System.out.println("Enter student ID: ");
                String id = input.nextLine();
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id.equals(id)) {
                        students.remove(i);
                    }
                }
            }
            if (choice == 3) {
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i));
                }
            }
            if (choice == 4) {
                System.out.println("Enter student ID: ");
                String id = input.nextLine();
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id.equals(id)) {
                        System.out.println(students.get(i));
                    }
                }
            }
            if (choice == 5) {
                System.out.println("Enter sort method: ");
                System.out.println("1. Sort via name");
                System.out.println("2. Sort via ID");
                int sort = input.nextInt();
                if (sort == 1) {
                    System.out.println("Sorting via name...");
                    Student.sortViaName(students);
                }
                if (sort == 2) {
                    System.out.println("Sorting via ID...");
                    Student.sortViaID(students);
                }
            }

        } while (choice != 0);
    }

}
