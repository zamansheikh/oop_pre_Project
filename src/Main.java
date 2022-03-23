import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("     _        __  __           _ _ _     _   _                 _ _        _ ");
            System.out.println("  __| | __ _ / _|/ _| ___   __| (_) |   | | | | ___  ___ _ __ (_) |_ __ _| |");
            System.out.println(" / _` |/ _` | |_| |_ / _ \\ / _` | | |   | |_| |/ _ \\/ __| '_ \\| | __/ _` | |");
            System.out.println("| (_| | (_| |  _|  _| (_) | (_| | | |   |  _  | (_) \\__ \\ |_) | | || (_| | |");
            System.out.println(" \\__,_|\\__,_|_| |_|  \\___/ \\__,_|_|_|___|_| |_|\\___/|___/ .__/|_|\\__\\__,_|_|");
            System.out.println("                                   |_____|              |_|                 ");
            System.out.println("                                                                          ");

            Scanner s = new Scanner(System.in);
            int choice = 9;
            System.out.println("Welcome to the main menu!");
            System.out.println("Please select an option:");
            System.out.println("1. Login to an existing account");
            System.out.println("0. Exit");
            choice = s.nextInt();
            if (choice == 1) {
                if (LogIn.ulogin()){
                    System.out.println("Login successful!");
                    Menu.menu();
                }
                else
                    System.out.println("Login failed!");
            }
            if (choice == 0){
                isRunning = false;
            } 

        }


    }
    
}
