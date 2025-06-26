public class GroceryList {
    public static void main(String[] args) {
        
        String[] groceries={"Milk","Butter","Bread","Cheese","Curd"};
        System.out.println("\nGrocery list:");

        for(int i=0; i<groceries.length; i++){
            System.out.println((i+1)+ "." + groceries[i]);
        }
    }
}
