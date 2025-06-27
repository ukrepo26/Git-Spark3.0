import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Customer customer;

    private List<Service> serviceList;

    private  double totalPrice;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addService(Service service){
        serviceList.add(service);
        totalPrice+=service.getPrice();

    }

    public void printInvoice(){
        System.out.println("-----------Invoice------------");
        System.out.println();
        System.out.println("Customer: "+customer.getName()+ " | Phone: "+customer.getPhone()+
                           " | CarNo: "+customer.getCar().getCarNumber()+ " | CarModel: "+customer.getCar().getCarModel());
        System.out.println("Services: ");
        for (int i=0; i<serviceList.size();i++){
            System.out.println((i+1)+" "+serviceList.get(i).getName()+ " $: "+serviceList.get(i).getPrice());
        }
        System.out.println("TotalAmount: $"+totalPrice);
        System.out.println();
        System.out.println("----------------Thank You-----------------");
    }
}
