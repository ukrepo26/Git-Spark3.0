public class MaxMinArray {
    public static void main(String[] args) {
        int arr[]={10,30,47,59,45};
        int max=arr[0], min=arr[0];

        System.out.println("\nArray element:");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]) {
                min=arr[i];
                
            }
            
        }
          System.out.println("maximum element:" +max);
          System.out.println("minimum element:" +min);

    }
}
