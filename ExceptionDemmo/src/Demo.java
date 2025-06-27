
class Student extends Demo{
    //default constructor
    Student()
    {
        System.out.println("cons....");
    }
    Student(int a)
    {
        System.out.println("m1-a");
    }

}


public class Demo {
    public static void main(String[] args) {
        Student s=new Student(10);
        s.m1();
    }

    public void m1(){
        System.out.println("m1");
    }
    public void m1(int a) {
        System.out.println("m1-a"+a);
    }
}
