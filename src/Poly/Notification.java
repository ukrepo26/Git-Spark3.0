package Poly;

public class Notification extends Wish {

    String name="Ankit";

    public static void main(String[] args) {
       Notification notify= new Notification();
         notify.notifyUser();
    }
    @Override
      public void greet(){
          System.out.println("ji "+name+ " ji");
      }
    public void notifyUser(){
        greet();

}

}
