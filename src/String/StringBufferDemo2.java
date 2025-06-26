package String;

public class StringBufferDemo2 {
    public static void main(String[] args) {
        String s1="Umesh";
        String s2=s1.concat("Kumar");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

        StringBuffer sb=new StringBuffer("Umesh");
        StringBuffer sb1=sb.append("Kumar");
        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb==sb1);
    }
}
