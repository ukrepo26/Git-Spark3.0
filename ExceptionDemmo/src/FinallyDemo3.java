public class FinallyDemo3 {
    public static void main(String[] args) {
        m2();
    }


    public static int m2() {
        try {
            System.out.println("try block...");
            System.exit(0);
            return 1;
        } catch (Exception e) {
            System.out.println("catch block...");
            return 2;
        } finally {
            System.out.println("finally block...");
            return 3;
        }
    }
}
