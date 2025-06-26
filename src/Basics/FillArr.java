import java.util.Arrays;

public class FillArr {
    public static void main(String[] args) {
        int []arr=new int[5];

        Arrays.fill(arr, 6);

        System.out.println("filled array: "+Arrays.toString(arr));
    }
}
