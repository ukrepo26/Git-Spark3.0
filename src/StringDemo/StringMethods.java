package StringDemo;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "UmeshKumar";
        System.out.println(s1.length()); //length of string

        // concatenation;
        String s2 = "Umesh";
        String s3 = "Kumar";
        String s4 = s2 + " " + s3;
        System.out.println(s4);

        //to char array
        String s5 = "Umesh Kumar";
        char[] arr = s5.toCharArray();
        System.out.println("to char array"+ Arrays.toString(arr));

        //char At
        String s7="Ronit";
        System.out.println("char at 1: " +s7.charAt(1));

        // compare string;
        String s8="Hello";
        String s9="Hello";
        System.out.println(s8==s9);
        System.out.println(s8.equals(s9));

        String s10=new String("Hello");
        String  s11=new String("Hello");
        System.out.println(s10==s11);  //address compare /false
        System.out.println(s10.equals(s11)); //content /true

        //index of
        String s12="Ramesh";
        System.out.println(s12.indexOf('m'));
        System.out.println(s12.indexOf('s'));

        //replace string
        String s13="Helio";
        String s14=s13.replaceAll("Helio","Ankit");
        System.out.println(s13.replace('i', 'l'));
        System.out.println(s14);

  // substring
        String s15="Hello Buddy Spark3.0 Java FullStack Course Hai:";
        String ss=s15.substring(0,11);
        System.out.println(ss);
        String st=s15.substring(30);
        System.out.println(st);
    }
}