package StreamAPIDemo;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40,50));
        System.out.println(arrayList);

        //wap the array element greater than 20
       List<Integer> collect= arrayList.stream().filter(i->i>20).collect(Collectors.toList());
        System.out.println(collect);

        //wap ad 5 in all element of array
        List<Integer> collect1= arrayList.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(collect1);

        //Terminal Operations
        //1.toArray
        Stream<Integer> s=Stream.of(1,2,3,4,5,6);
        Object[]array=s.toArray();
      for ( Object a:array) {
          System.out.print(a + " ");
      }

        System.out.println();
          //count() methods
        Stream<Integer> s1=Stream.of(1,2,3,4,5,6);
          long count=s1.count();
          System.out.print(count);

        System.out.println("---------------------");
        System.out.println();
          //ForEach
        Stream<Integer> s2=Stream.of(1,2,3,4,5,6);
            s2.forEach(ele -> System.out.print(ele+" "));

        System.out.println();
        System.out.println("-----------------");
            //min or max
        Stream<Integer> s3=Stream.of(1,2,3,4,5,6);
        Stream<Integer> s4=Stream.of(1,2,3,4,5,6);
        Optional<Integer> min = s3.min((Integer o1, Integer o2) ->o1.compareTo(o2) );
        Optional<Integer> max = s4.max((Integer o1, Integer o2) ->o1.compareTo(o2) );
        System.out.println("min :: " +min.get());
        System.out.println("max :: " +max.get());


        System.out.println();
        System.out.println("-----------------");
        List<Integer> list=Arrays.asList(22,33,54,65,23,67);
        boolean anyMatch = list.stream().anyMatch(i -> i == 23);
        System.out.println(anyMatch);
    }
}
