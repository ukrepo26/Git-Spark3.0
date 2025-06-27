package FunctionalInterface;

interface jadu{
    abstract void sum(int a , int b);
}
public class Addition {
    public static void main(String[] args) {
        jadu j=( a, b)->{
            System.out.println(a+b);

        };
        j.sum(10,10);
    }
}
