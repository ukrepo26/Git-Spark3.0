import java.util.Scanner;

public class RestaurantSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Raj Restaurant!");
        System.out.println("1. Burger, $5");
        System.out.println("2. Momos, $10");
        System.out.println("3. Pizza , $15");
        System.out.println("4. Chowmin, $8");
        System.out.println("5. Exit");

        System.out.println("Enter the number of order: ");
      int choice=  sc.nextInt();

      int price=0;

      switch (choice) {
        case 1:
        price=5;
        System.out.println("Your order is Burger.");
         break;
         case 2:
         price=10;
         System.out.println("Your order is Momos.");
          break;
          case 3:
          price=15;
          System.out.println("Your order is Pizza.");
           break;
           case 4:
           price=8;
           System.out.println("Your order is Chowmin.");
            break;
            case 5:
            System.out.println("Exiting! Thank You.");
             return;          
      
        default:
        System.out.println("Invalid choice! please choose the valid choice.");
         return;
      }
  System.out.println("Total Price ₹: " +price);
  sc.close();
    }

}
