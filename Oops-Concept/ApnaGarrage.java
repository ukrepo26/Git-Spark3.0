public class ApnaGarrage extends BmwCar{
    
public static void main(String[] args) {
    ApnaGarrage obj=new ApnaGarrage();
     obj.modification();;
}

    void modification()
    {
        drive();
        System.out.println("old color: "+color);
        color="red";
        System.out.println("modify color: "+color);
    }
}
