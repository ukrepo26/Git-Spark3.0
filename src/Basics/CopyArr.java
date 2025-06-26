import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArr {

    public static void main(String[] args) {
        
        int arr[]={7,8,4,5,2};

        int copy[]=Arrays.copyOf(arr,arr.length);

        System.out.println("original array:" +Arrays.toString(arr));
        System.out.println("copy array: " +Arrays.toString(copy));
    }
}