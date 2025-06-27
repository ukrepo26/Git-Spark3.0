package CollectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        /* not right for dev
        List al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add("kumar");
        al.add(40);

        System.out.println(al);
*/

    List<Integer> arr=new ArrayList<>(); //cc--->10;  when new arraylist (10*1.5)+1;
     arr.add(10);
     arr.add(20);
     arr.add(30);
     arr.add(40);
     arr.add(20);
     System.out.println(arr);

        System.out.println(arr.get(1));

     List<String> arr1=new ArrayList<>(20);

    }
}
