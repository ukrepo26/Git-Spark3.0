import java.util.Arrays;

public class SalesSort {
    public static void main(String[] args) {
        int[] sales={8,7,9,11,14,3,5};

        Arrays.sort(sales);
        System.out.println("Print the sales(low to high)");
        for(int sale: sales){
          System.out.println(sale+ " ");
            System.out.println(Arrays.toString(sales));
        }
    }
}
