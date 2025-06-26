import java.util.Scanner;

public class VowelString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a String:");
        String s=sc.nextLine().toLowerCase();

        int count = 0;

    //    for(int i=0; i<s.length(); i++ ){
      //      char ch=s.charAt(i);
      for (char ch : s.toCharArray()) {
      
        //    if (ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') 
        if ("aeiou".indexOf(ch)!= -1) {
       
            
        
                count++;
                
            }

        }
         System.out.println(count);
         sc.close();
    }
}
