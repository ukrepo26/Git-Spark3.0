package StringDemo;

public class MethodDemo {
    public static void main(String[] args) {

        print();
        int s=samose();
        System.out.println("samose: "+s);
        display("Akash");
        display("Ankit",21);
        int sum =sum(10,20);
        System.out.println(sum);

    }
;    // method with no return and no parameter
    public static void print() {
        System.out.println("Hello Friends!");
    }
        // method with return and no parameter
    public static int samose(){
        return 2;
    }
    // method with no return and with parameter
    public static void display(String name){
        System.out.println(name);
    }
    public static void display(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
     // method with return and with parameter
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
}
