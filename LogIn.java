import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String storedUsername="Akashsingh";
        String storedPassword="Pasword1234";

        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Username:");
      String Username=sc.nextLine();

        System.out.println("\nEnter Password:");
        String Password=sc.nextLine();

        if (Username.equals(storedUsername) && Password.contentEquals(storedPassword) ) {
            System.out.println("Log In Successfully:");
            
        } else {
            System.out.println("Invalid Usename and Password . Try Again");
        }
        sc.close();
    }
}
