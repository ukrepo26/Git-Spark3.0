public class InvertHalf1 {
  public static void main(String[] args) {
    //int n=5;
     for(int i=1; i<=5; i++){
        for(int j=1; j<=5-i; j++){
            System.out.print("  ");
        }
        for(int k=1; k<=i; k++){
            System.out.print("* ");
        }
      System.out.println();

    }
  }    
}

//     public static void main(String[] args) {
//         int n = 5; // Number of rows

//         for (int i = 1; i <= n; i++) {
//             // Printing spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print("  "); // Two spaces for better alignment
//             }
//             // Printing stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }