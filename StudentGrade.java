import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter your score:");
        int score=sc.nextInt();

        if (score>=90) {
            System.out.println("Grade A");
            
        } else if (score>=80) {
            System.out.println("Grade B");
            
        } else if (score>=70) {
            System.out.println("Grade C");
            
        } else if (score>=60) {
            System.out.println("Grade D");
        } else {
             System.out.println("Grade E");

             sc.close();
        }
            
        } 
            
        } 
            
        
