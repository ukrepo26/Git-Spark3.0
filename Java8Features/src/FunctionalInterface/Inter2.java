package FunctionalInterface;

public interface Inter2 {
    abstract void m1();
}

class A{
    int x=100; //Instance var
    public void show(){
        int x=1000; //Local var
        Inter2 inter2=()-> {
            System.out.println(x);
            System.out.println(this.x);
        };
        inter2.m1();
    }
}

class Test3{
    public static void main(String[] args) {
        A a=new A();
        a.show();
    }
}