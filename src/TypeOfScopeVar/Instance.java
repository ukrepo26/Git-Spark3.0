package TypeOfScopeVar;

public class Instance {
    String name= "Ankit";// instance var
    public static void main(String[] args) {
         Instance obj=new Instance();
        System.out.println(obj.name);
         obj.name="Sanjay";
        System.out.println(obj.name);

        System.out.println("-----------------");
        Instance obj1=new Instance();
        System.out.println(obj1.name);
        obj1.name="Ramesh";
        System.out.println(obj1.name);
    }

}
