import java.util.Arrays;

public class CompArr {
    public static void main(String[] args) {
        
    

    int a1[]={1,2,3,4,5};
    int a2[]={6,6,4,3,7};
    int a3[]={1,2,3,4,5};

    boolean res1=Arrays.equals(a1, a2);
    boolean res2=Arrays.equals(a1, a3);

    System.out.println("array a1 and a2 are equal: "+res1);
    System.out.println("array a1 and a3 are equal: "+res2);
}
}