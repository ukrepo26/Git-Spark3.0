import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int arr[]=new int [5];
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the Array Element:");

        for(int i=0; i<arr.length-1; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Element:");
        for(int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]+ " ");
            
        }
      System.out.println("Enter Search Element:");
      n=sc.nextInt();

      for(int i=0; i<arr.length-1; i++){
          if(n==arr[i]){
            count++;
          }
        }
          if (count>0) {
                System.out.println("Item Found "+count+ " times ");
              } else {
                System.out.println("Item Not Found!");
              }

        
          sc.close();

    }
}
