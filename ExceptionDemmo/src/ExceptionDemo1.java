public class ExceptionDemo1 {

    public static void main(String[] args) {

        m1();
    }

    public static void m1()
    {
        try{
         m2();
    } catch (Exception e) {
            e.printStackTrace();//name of exc : des and stack
            System.out.println(e.getMessage());//only des
            System.out.println(e.toString());//name and des
        }
    }


    public static void m2()
    {
        m3();
    }

    public static void m3()
    {
        m4();
    }

    public static void m4()
    {
      //  throw new RuntimeException("divide zero");
        System.out.println(10/0);
    }

}
