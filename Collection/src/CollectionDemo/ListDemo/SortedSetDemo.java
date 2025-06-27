package CollectionDemo.ListDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        SortedSet<Integer> ss=new TreeSet<>();
        ss.add(10);
        ss.add(5);
        ss.add(43);
        ss.add(65);
        ss.add(17);

        System.out.println(ss);
    }
}
