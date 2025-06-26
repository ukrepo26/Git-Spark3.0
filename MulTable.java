import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
           // int num=5;
           Scanner sc=new Scanner(System.in);
           System.out.println("\nEnter the number whose print the the table:");
           int num=sc.nextInt();
         
            for(int i=1; i<=10; i++){

                System.out.println( num+ "x" + i + "="  +(num*i));
            }
            sc.close();
    }
}
