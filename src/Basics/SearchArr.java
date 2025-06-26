import java.util.Arrays;

public class SearchArr {

    public static void main(String[] args) {
        
        int arr[]={10,20,30,40,50};

        int index=Arrays.binarySearch(arr, 30);

     if (index>=0) 
     {
        System.out.println(" Element 30 found at index:" +index);   
     }
     else{
        System.out.println("Element not found.");
     }

    }
}