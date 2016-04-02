/**
 * Created by SHIKUN on 2016/4/2.
 */
public class MyThread1 extends Thread {
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + "begin");
            Thread.sleep(2000);

            System.out.println("run threadName=" + this.currentThread().getName() + "end");

        } catch (InterruptedException ex) {
            ex.printStackTrace();

        }
    }

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("begin=" + System.currentTimeMillis());
        myThread1.run();
        System.out.println("end= " + System.currentTimeMillis());

    }
}
