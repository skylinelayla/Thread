/**
 * Created by SHIKUN on 2016/3/31.
 */
public class MyThread_muti extends Thread {
    private int count=5;

    public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
    }

    public static void main(String[] args) {
        MyThread_muti mythread = new MyThread_muti();
        Thread a = new Thread(mythread, "A");
        Thread b = new Thread(mythread, "B");
        Thread c = new Thread(mythread, "C");
        a.start();
        b.start();
        c.start();

    }
}
