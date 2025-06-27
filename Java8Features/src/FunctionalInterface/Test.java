package FunctionalInterface;

@FunctionalInterface
interface inter{
    public abstract void m1();
}

/*
class A implements inter{

    @Override
    public void m1() {
        System.out.println("Hello m1..");
    }
}
*/

public class Test {
    public static void main(String[] args) {
        inter i=()-> {
            System.out.println("hello m1");
        };
        i.m1();
    }
}
