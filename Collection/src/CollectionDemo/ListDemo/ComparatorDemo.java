package CollectionDemo.ListDemo;

import java.util.Comparator;
import java.util.TreeSet;

class employee implements Comparator {
     private int id;
     private String name;


     employee()
     {

     }

     public employee(int id, String name) {
         this.id = id;
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Object o1, Object o2) {
         employee e1=(employee) o1;
         employee e2=(employee) o2;

         if (e1.getId()>e2.getId())
         {
             return +1;
         } else if (e1.getId()<e2.getId()) {
             return  -1;
         }
         else {
             return 0;
         }
    }
}


public class ComparatorDemo {
    public static void main(String[] args) {
        employee emp1=new employee(1,"Aman");
        employee emp2=new employee(2,"Om");
        employee emp3=new employee(3,"Akash");
        employee emp4=new employee(4,"Raju");

        TreeSet<employee> ts=new TreeSet<>(new employee());
        ts.add(emp1);
        ts.add(emp2);
        ts.add(emp3);
        ts.add(emp4);

        System.out.println(ts);
    }
}
