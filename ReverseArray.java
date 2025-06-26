public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,5,4,7,8};

        for (int num : arr) {
            System.out.println(num+ " ");
             }
              System.out.println("\nReversal of Array:");
              for(int i=arr.length-1; i>=0; i--){
                System.out.println(arr[i]+ " ");
              }
    }
}
