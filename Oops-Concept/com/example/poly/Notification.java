package com.example.poly;

public class Notification extends Wish {

        String name="simran";
    public static void main(String[] args) {
        Notification ob=new Notification();
        ob.notifyUser();
    }
 
    @Override
    public void greet(){
        System.out.println("ji " +name+ " ji");
    }

    public void notifyUser()
    {
        greet();
    }
}
