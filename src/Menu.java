import java.util.*;

public class Menu {
    public static void menu(){
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int choice = -1;
        do{
            System.out.println("Welcome to the main menu!");
            System.out.println("Please select an option:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. View all students");
            System.out.println("4. View a student");
            System.out.println("5. Sort students");
            System.out.println("0. Exit");

        
            choice = s.nextInt();
        
            if (choice == 1){
                System.out.println("Enter student name: ");
                String name = s1.nextLine();
                System.out.println("Enter student ID: ");
                String id = s1.nextLine();
                System.out.println("Enter student mark: ");
                int mark = s.nextInt();
                students.add(new Student(name, id, mark));
            }
            if (choice == 2){
                System.out.println("Enter student ID: ");
                String id = s1.nextLine();
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
                String id = s1.nextLine();
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
                    System.out.println("Sorting via name...");
                    Student.sortViaName(students);
                }
                if (sort == 2){
                    System.out.println("Sorting via ID...");
                    Student.sortViaID(students);
                }
            }   
            
        }while(choice != 0);
        s.close();
        s1.close();
    }
}
    

