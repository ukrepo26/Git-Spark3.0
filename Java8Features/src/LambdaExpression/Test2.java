package LambdaExpression;

public class Test2 {
    public static void main(String[] args) {

       /* Demo2 demo2 = (a,  b) ->{
            System.out.println("add "+(a+b));

             demo2.add(10,"Ram");
             };
*/
        Demo2 demo2=(a, b)-> a+b;
        System.out.println(demo2.add(10,30));

    }
}
