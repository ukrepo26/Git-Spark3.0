public class TryWithMultipleCatch {
    public static void main(String[] args) {



        try{
            m1();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch (ArithmeticException a)
        {
            a.printStackTrace();
        }
        catch (Exception r){
            r.printStackTrace();
        }
    }

    public static int m1(){
        int arr[]=new int[2];

        if (arr.length>3){
            return arr[4];
        }
           else {
               return arr[0]/arr[1];
        }


    }
}
