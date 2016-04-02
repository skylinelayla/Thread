/**
 * Created by SHIKUN on 2016/4/2.
 */
public class samNum extends Thread {
    private int i=5;
    synchronized  public void run() {
        System.out.println("i=" + (i--) + "threadName=" + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        samNum samNum = new samNum();
        Thread thread = new Thread(samNum);
        Thread t2 = new Thread(samNum);
        Thread t3 = new Thread(samNum);
        Thread t4 = new Thread(samNum);
        thread.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(Thread.currentThread().getName());

    }
}
