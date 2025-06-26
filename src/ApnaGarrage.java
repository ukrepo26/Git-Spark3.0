public class ApnaGarrage extends BmwCar {

    public static void main(String[] args) {

        ApnaGarrage apnaGarrage=new ApnaGarrage();
        apnaGarrage.modification();
    }
    public void modification(){
        drive();
        System.out.println("old color: "+color);
         color="Black";
        System.out.println("modification color: "+color);
    }
}
