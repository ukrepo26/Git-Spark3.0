package CollectionDemo.ListDemo;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo  {
    public static void main(String[] args) {

        Vector<Integer> vector=new Vector<>();
        vector.add(10);
        vector.add(4);
        vector.add(45);
        vector.add(12);

        Enumeration env= vector.elements();
          // imp
        //object
        while (env.hasMoreElements())
        {
            Integer data = (Integer) env.nextElement();

            System.out.println(data);
        }

    }

}
