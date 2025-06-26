public class SumAverage {
    public static void main(String[] args) {
        int arr[]={10,20,5,25};
        int sum=0;
            for (int num : arr) {
                sum+=num;
                
            }
            double average=sum/arr.length;

            System.out.println("\nSum of Array Element: "+sum);
            System.out.println("\nAverage of Array Element: "+average);
    }
}
