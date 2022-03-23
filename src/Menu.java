import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner s = new Scanner(System.in);
        int choice = 9;
        System.out.println("Welcome to the main menu!");
        System.out.println("Please select an option:");
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. View all students");
        System.out.println("4. View a student");
        System.out.println("5. Sort students");
        System.out.println("0. Exit");

        ArrayList<student> students = new ArrayList<student>();
        
        choice = s.nextInt();
        while (choice != 0){
            if (choice == 1){
                System.out.println("Enter student name: ");
                String name = s.nextLine();
                System.out.println("Enter student ID: ");
                String id = s.nextLine();
                System.out.println("Enter student mark: ");
                int mark = s.nextInt();
                students.add(new student(name, id, mark));
            }
            if (choice == 2){
                System.out.println("Enter student ID: ");
                String id = s.nextLine();
                for (int i = 0; i < students.size(); i++){
                    if (students.get(i).id.equals(id)){
                        students.remove(i);
                    }
                }
            }
            if (choice == 3){
                for (int i = 0; i < students.size(); i++){
                    System.out.println(students.get(i));
                }
            }
            if (choice == 4){
                System.out.println("Enter student ID: ");
                String id = s.nextLine();
                for (int i = 0; i < students.size(); i++){
                    if (students.get(i).id.equals(id)){
                        System.out.println(students.get(i));
                    }
                }
            }
            if (choice == 5){
                System.out.println("Enter sort method: ");
                System.out.println("1. Sort via name");
                System.out.println("2. Sort via ID");
                int sort = s.nextInt();
                if (sort == 1){
                    sortViaName(students);
                }
                if (sort == 2){
                    sortViaID(students);
                }
            }

    }
    
}
