package CollectionDemo.ListDemo;

import com.sun.jdi.Value;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> ml=new HashMap<>();
        ml.put(1,"One");
        ml.put(2,"Two");
        ml.put(3,"Three");
        ml.put(4,"Four");

        System.out.println(ml);

       Set<Map.Entry<Integer,String >> entries= ml.entrySet();
       Iterator<Map.Entry<Integer,String >> iterator= entries.iterator();
       while (iterator.hasNext()){
           Map.Entry<Integer,String> entry=iterator.next();
           System.out.println("key---> "+entry.getKey()+ " value---> "+entry.getValue());
       }

       for (String val:ml.values()){
           System.out.println(val);
       }
       for (Integer key:ml.keySet()){
           System.out.println(key);
       }
       //lambda expression


    }
}
