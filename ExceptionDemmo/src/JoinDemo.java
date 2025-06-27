class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}




public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable m = new MyRunnable();
        Thread t = new Thread(m);
        t.start();
        t.join(); //main thread waiting for thread 0

        for (int i = 0; i < 5; i++) {

            System.out.println("main-thread " + i);
        }
    }
}
