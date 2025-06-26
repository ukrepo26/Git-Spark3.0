public class AtmDemo {

   private int balance = 10000;
     private String location = "Noida";
    private String bank = "HDFC";
    private String AccNo = "5467389299";

    public static void main(String[] args) {
      AtmDemo at=new AtmDemo();
    int res= at.getBalance();
        System.out.println(res);
       String st= at.getAccNo();
        System.out.println(st);

        at.details();
    }


        public int getBalance() {
            return balance;

        }

//        public void setBalance() {
 //           this.balance = 154776998;
//        }

        public String getAccNo() {
          return AccNo;
    }


        private void details() {
            System.out.println("location:"+location);
        }
    }
