import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        int res=sum(a,b);
        System.out.println("sum is: "+res);
        int res1=div(a,b);
        System.out.println("div is: "+res1);
    }

    public static  int sum(int a, int b)
    {
        return a+b;
    }

    public static  int div(int a, int b)
    {
        return a/b;
   /* try {
        int res1=a/b;
        return res1;
    } catch (Exception e) {
        System.out.println("invalid input");
        return 0;
    }*/

    }
}
