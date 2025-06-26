import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int [] num = {20,10,50,40,30};
        
     System.out.println("Original Array:");
     System.out.println(Arrays.toString(num));

     Arrays.sort(num);
     
     System.out.println(Arrays.toString(num));
     

     System.out.println("sorted array :");

     for(int i=num.length-1; i>=0; i--){

        System.out.println(num[i] + " ");
     }
     
    }
}
