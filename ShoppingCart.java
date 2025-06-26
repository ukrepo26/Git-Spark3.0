import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {
        
      //  double CartTotal=99.99;
        double ShippingCost;
         Scanner sc = new Scanner(System.in); 
            System.out.println("\nEnter your carttotal");

            double CartTotal=sc.nextDouble();
                if (CartTotal>=100) {
                    ShippingCost=0;
                    System.out.println("your quality for free shippingcost.");
                    
                } 
                else {
                    ShippingCost= 5.99 ;
                    System.out.println("shippingcost is ₹ +5.99");
                }
                System.out.println("TotalCart after shopping: ₹ " +(CartTotal+ShippingCost));
                sc.close();
        }
    }
