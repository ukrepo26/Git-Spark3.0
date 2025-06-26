import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        int[] arr={2,4,1,3,6,9};
       System.out.println("\nprint the array length:");
        System.out.println(arr.length);

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

       /*  Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));*/
        //  int index= Arrays.binarySearch(arr, 3);
      //  System.out.println(index);

        int arr1[]= Arrays.copyOf(arr, 8);
        arr1[6]=8;
        arr1[7]=0;
        System.out.println(Arrays.toString(arr1)); 
     
    }
}
