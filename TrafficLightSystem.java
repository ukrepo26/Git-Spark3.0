import java.util.Scanner;

public class TrafficLightSystem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("\nEnter the traffic light color (red, yellow, green)");
        String LightColor=sc.nextLine().toLowerCase();

         if (LightColor.equals("red")) {
            System.out.println("Stop! until the turns light green.");
            
         } else if (LightColor.equals("yellow")) {
            System.out.println("Slow down! prepare to stop.");
         } else if (LightColor.equals("green")) {
            System.out.println("GO! you can proceed.");
         } else {
            System.out.println("Invalid color! Please enter the red,yellow or green color.");
         }
            sc.close();
         
            
         
    }
}