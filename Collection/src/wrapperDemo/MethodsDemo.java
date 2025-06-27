package wrapperDemo;

public class MethodsDemo {
    public static void main(String[] args) {
        String num="222";
        int val= Integer.parseInt(num);

        System.out.println("The parse value:"+val);

        int a=10;
        String s=Integer.toString(a);
        System.out.println("String "+s);

        int b=15;
        int c=12;
        System.out.println("compare "+Integer.compare(b,c));


       Integer res= Integer.valueOf("2654");
        System.out.println(res);
    }


}
