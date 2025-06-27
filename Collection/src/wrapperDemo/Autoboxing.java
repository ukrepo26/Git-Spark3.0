package wrapperDemo;

public class Autoboxing {
    public static void main(String[] args) {

        int a=10;
        Integer i=a;//auto-boxing int---->prim

  // Unboxing pri---->int
        System.out.println(a);

        int b=i;
        System.out.println(b);
    }
}
