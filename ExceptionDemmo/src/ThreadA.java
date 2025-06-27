public class ThreadA {
    public static void main(String[] args) throws InterruptedException {

        MyThread5 t=new MyThread5();
        t.start();
        synchronized (t){
            System.out.println("Main thread calling wait().... ");
            t.wait();
            System.out.println("main thread got notification...");
        }
    }
}


class MyThread5 extends Thread{

    int sum=0;

    @Override
    public void run() {
        synchronized (this){
            System.out.println("child thread start cal.....");
            for (int i=0; i<10; i++){
                sum=sum+i;
            }
            System.out.println("sum is: "+sum);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("child thread will give notification...");
            this.notify();
        }
    }
}
