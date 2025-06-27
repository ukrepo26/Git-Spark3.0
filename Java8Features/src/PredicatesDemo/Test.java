package PredicatesDemo;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
       /* Predicate<Integer> p=I->I>50;
        Predicate<String> p1=S->S.length()>5;
        System.out.println(p.test(100));
        System.out.println(p1.test("Umesh"));
        }
*/
        int [] x={1,2,3,4,5,6};
        Predicate<Integer>p1=I->I%2==0;
        Predicate<Integer>p2=I->I>2;
        System.out.println("Print All Even Numbers: ");
         m1(p1,x);
        System.out.println("Print All Greater Numbers than 2: ");
        m1(p2,x);
        System.out.println("Print All Even  Numbers Greater than 2: ");
        m1(p1.and(p2),x);
        System.out.println("Print All  Numbers or greater than : ");
        m1(p1.or(p2),x);

        System.out.println("Print All odd Numbers: ");
        m1(p1.negate(),x);


    }
        public static void m1(Predicate<Integer>p,int []x){
        for (int i:x){
            if (p.test(i))
                System.out.println(i);

        }
        }

    }

