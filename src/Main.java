import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {

        boolean isRunning = true;
        Scanner s = new Scanner(System.in);
        while (isRunning) {

            int choice = 9;
            System.out.println("Welcome to the main menu!");
            System.out.println("Please select an option:");
            System.out.println("1. Login to an existing account");
            System.out.println("0. Exit");
            choice = s.nextInt();
            if (choice == 1) {
                Menu.menu();
                if (LogIn.ulogin()){
                    System.out.println("Login successful!");
                }
                else
                    System.out.println("Login failed!");
            }
            if (choice == 0){
                isRunning = false;
            } 

        }
        s.close();


    }
    
}
