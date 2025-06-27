public class FinallyDemo2 {
    public static void main(String[] args) {

        m1();
    }

    public static void m1(){
        try {
            System.out.println("try block...");
            return;
        }
        catch (Exception e)
        {
            System.out.println("catch block...");
        }
        finally {
            System.out.println("finally block...");
        }
    }
}
