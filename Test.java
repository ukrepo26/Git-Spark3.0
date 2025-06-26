public class Test {

        public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = new String("Java");
        
        System.out.println(s1 == s2); // (1)
        System.out.println(s1.equals(s2)); // (2)
        System.out.println(s1 == s3); // (3)
        }
        }
        
        

