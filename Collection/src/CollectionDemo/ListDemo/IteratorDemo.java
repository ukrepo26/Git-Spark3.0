package CollectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> al=new ArrayList<>();
         al.add(10);
         al.add(23);
         al.add(12);
         al.add(14);

        Iterator<Integer> iterator = al.iterator();

        while (iterator.hasNext())
        {
            Integer data = iterator.next();
            System.out.println(data);

            if (data==23)
            {
                iterator.remove();
            }
        }
        System.out.println(al);
    }
}
