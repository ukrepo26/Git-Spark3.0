package String;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("abcd");
        StringBuffer obj= sb.append("cdace");
        System.out.println(sb.hashCode());
        System.out.println(obj.hashCode());
    }
}
