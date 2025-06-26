package TypeOfScopeVar;

public class StaticDemo {
    static String name="Akash";

    public static void main(String[] args) {
      //  StaticDemo obj=new StaticDemo();
        System.out.println(StaticDemo.name);
        StaticDemo.name="Ankit";
        System.out.println(StaticDemo.name);

        System.out.println("----------------");
       // StaticDemo obj1=new StaticDemo();
        System.out.println(StaticDemo.name);
        StaticDemo.name="Ramesh";
    }

}
