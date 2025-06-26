import java.util.Scanner;

public class AtmServiceSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nWelcome to SBI Atm.");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposite");
        System.out.println("3. Balance Enquiry");
        System.out.println("4. Exit");

        System.out.println("\nselect the transaction:");

    
       int choice=sc.nextInt();

       switch (choice) {
        case 1:
        System.out.println("Withdraw processing.....");
         break;
         case 2:
         System.out.println("Deposite processing.....");
          break;
          case 3:
          System.out.println("Balance Enquiry processing.....");
           break;
           case 4:
           System.out.println("Exit! Thank You.");
            break;
      
        default:
        System.out.println("Invalid choice! please choose the valid choice.");
            break;
       }
    sc.close();
    }
}
