/**不共享变量，每个线程都会执行自己的变量
 * Created by SHIKUN on 2016/4/2.
 */
public class SafeMythread extends Thread {
    private int count=5;

    public SafeMythread(String name) {
        super();
        this.setName(name);
    }

    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);

        }
    }

    public static void main(String[] args) {
        SafeMythread safeMythread = new SafeMythread("A");
        SafeMythread safeMythread1 = new SafeMythread("B");
        SafeMythread safeMythread2 = new SafeMythread("C");
        safeMythread.start();
        safeMythread1.start();
        safeMythread2.start();

    }
}
