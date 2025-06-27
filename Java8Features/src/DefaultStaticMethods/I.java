package DefaultStaticMethods;

public interface I {
    default void KSeries() {
        System.out.println("KSeries engine-i...");
    }
}
    interface J {
        default void KSeries() {
            System.out.println("KSeries engine-j...");
        }

    }


/*
class Car implements I{
    public void start(){
        System.out.println("Car Started..");
           }

}*/

    class Car implements I, J {
        public static void main(String[] args) {
            Car car = new Car();
            car.KSeries();


        }
     @Override
        public void KSeries() {
            I.super.KSeries();
        }
    }




