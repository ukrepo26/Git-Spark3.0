public class OneZeroPyramid {
    public static void main(String[] args) {
        
        System.out.println("\n Print:");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                int sum=i+j;
              if (sum%2==0) {
                System.out.print("1 ");
              } else {
                System.out.print("0 ");
              }
            }
            System.out.println();
        }
    }
}
