/**共享数据的做法
 * Created by SHIKUN on 2016/4/2.
 */
public class SafeMythreadpublic extends Thread {
    private int count=5;
    public void run() {
        super.run();
        while(count>0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);

        }
    }

    public static void main(String[] args) {
        SafeMythreadpublic safeMythread = new SafeMythreadpublic();
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
