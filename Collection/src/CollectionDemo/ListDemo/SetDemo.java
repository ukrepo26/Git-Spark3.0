package CollectionDemo.ListDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(13);
        set.add(10);
        System.out.println(set);

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);



    }

}
