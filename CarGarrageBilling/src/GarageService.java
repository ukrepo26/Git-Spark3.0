import java.util.*;

public class GarageService {

    private Map<String,Customer> customerMap;

    private List<Service> availableService;

    public GarageService() {
        this.customerMap = new HashMap<>();
        this. availableService= new ArrayList<>();
        loadServices();
    }

    public void loadServices(){
        availableService.add(new Service("Car Wash",500.0));
        availableService.add(new Service("Oil Change",700.0));
        availableService.add(new Service("Wheel Alignment",200.0));
        availableService.add(new Service("Tyre Replacement",3000.0));
        availableService.add(new Service("Puncture",50.0));
    }

    public void addCustomer(String name, String phone , String carNumber, String carModel){
        Car car=new Car(carNumber, carModel);
        Customer customer=new Customer(name, phone,car);
         customerMap.put(carNumber,customer);
        System.out.println("Customer Added Successfully...");
    }

        public void createInvoice(String carNumber){
        if (!customerMap.containsKey(carNumber)){
            System.out.println("Customer not found with CarNumber "+carNumber);
             return;
        }

            Scanner sc=new Scanner(System.in);
            Customer customer=customerMap.get(carNumber);
            Invoice invoice=new Invoice(customer);
            System.out.println("AvailableService:");
        for (int i=0; i<availableService.size(); i++){
            System.out.println((i+1)+" . "+availableService.get(i).getName()+ " - $"+availableService.get(i).getPrice());
        }

        while (true){
            System.out.println("Enter Service Number to Add");
           int choice=sc.nextInt();
           if (choice==0)break;
           if (choice>0 && choice<=availableService.size()){
               invoice.addService(availableService.get(choice-1));
               System.out.println("Service Done.");
           }
             else {
               System.out.println("Invalid Choice!");
           }
           }
              invoice.printInvoice();

        }
    }

