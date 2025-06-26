import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter current temprature:");
                 double currentTemprature=sc.nextDouble();

                 if (currentTemprature<16) {
                    System.out.println("Turn on heating.");
                    
                 } else if (currentTemprature>22) {
                    System.out.println("Turn on Air Conditioning.");
                    
                 } else {
                     System.out.println("Maintaining Temprature");

                     sc.close();
                 } 
                    
                 }


    }

