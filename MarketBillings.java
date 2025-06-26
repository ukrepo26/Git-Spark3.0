public class MarketBillings {
    public static void main(String[] args) {
        double [] prices={5,6.5,10,11.5,12.99,15.01};
        double total=0;

        System.out.println("\n Item prices");
        for(int i=0; i<prices.length; i++){
            System.out.println("Item" +(i+1)+ " : $ "+prices[i]);
            total+=prices[i];
        }
        System.out.println("\n Total Cost: $ "+total);
    }
}
