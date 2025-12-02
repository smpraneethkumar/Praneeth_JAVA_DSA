package Samples;

public class DemoJPF {

    static int x = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> x++);
        Thread t2 = new Thread(() -> x++);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(x);
    }
}
