package CollectionDemo.ListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(23);
        al.add(12);
        al.add(14);

        ListIterator<Integer> iterator= al.listIterator();
        while (iterator.hasNext()){
            Integer data = iterator.next();
            System.out.println(data);

            if (data==23){
                iterator.remove();
            }

        }
        System.out.println(al);

            }
    }
