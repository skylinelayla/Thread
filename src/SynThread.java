/**
 * 数据在多个线程同步
 * Created by SHIKUN on 2016/4/2.
 */
public class SynThread extends Thread {
    private int count=5;
    synchronized public void run() {
        super.run();
     //如果加了循环判定会被上锁别的线程会一直进行使用

            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);

    }

    public static void main(String[] args) {
        SynThread safeMythread = new SynThread();
        Thread a = new Thread(safeMythread, "A");
        Thread b = new Thread(safeMythread, "B");
        Thread c = new Thread(safeMythread, "C");
        Thread d = new Thread(safeMythread, "D");
        Thread e = new Thread(safeMythread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
