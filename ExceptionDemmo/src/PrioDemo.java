public class PrioDemo {
    public static void main(String[] args) {

        Thread t1=new Thread(new MyRunnable());
        Thread t2=new Thread(new MyRunnable());
        Thread t3=new Thread(new MyRunnable());

        System.out.println("main thread "+Thread.currentThread());
        System.out.println("Thread-t1: "+t1.getPriority());

        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("thread-t1 priority:"+t1.getPriority());
        System.out.println("thread-t2 priority:"+t2.getPriority());
        System.out.println("thread-t3 priority:"+t3.getPriority());
    }
}
