import java.util.Scanner;

public class LogIn {
    //user login method using file i/0
    public static boolean ulogin(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = s.nextLine(); 
        System.out.println("Enter your password: ");
        String password = s.nextLine();
        s. close();
        if (username.equals("admin") && password.equals("admin")){
            return true;
        }
        else{
            return false;
        }
    }
    
}
