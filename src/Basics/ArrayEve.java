import java.util.Scanner;

public class ArrayEve {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array size:");
         int size=sc.nextInt();

           int arr[]=new int[size];

           System.out.println("Enter the elements of array");          


         for ( int i=0; i<size; i++) {
            arr[i]=sc.nextInt();  
                
            }
            int sum=0;
   
            for(int i=0; i<size ; i += 2){
                sum+=arr[i];
            }
            System.out.println("the sum of even index of array:"+sum);
            
         }
    }

