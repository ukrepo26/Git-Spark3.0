import java.io.File;
import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        try {
            System.out.println("test the exception");
            System.out.println("calculating......");
            File file=new File("Demo.text");
            Scanner sc = new Scanner(file);
            System.out.println("bjjkasbtu");
        }
        catch (Exception e)
        {
            System.out.println("Catch block running...");
            System.out.println(e);

        }
        System.out.println("after calculating.....");
        System.out.println("kumar");
        System.out.println("kumar");
        System.out.println("kumar");


    }

}
