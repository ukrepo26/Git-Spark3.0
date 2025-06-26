package ThisSuerDemo;

public class Child extends Parent {
   String name;
    public static void main(String[] args) {
     Child ch=new Child();
       ch.details();

    }
    public  void details(){
        super.name="Parent";
        this.name="Child";
        System.out.println(super.name+ "  " +this.name);
        System.out.println("Parent ka method--->");

         super.details();
    }
}
