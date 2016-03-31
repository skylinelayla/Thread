/**
 * Created by SHIKUN on 2016/3/31.
 */
public class MyRunnable implements Runnable {
    public void run() {//可以实现多个，还可以去继承
        System.out.println("运行中");

    }

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);//传入对象
        thread.start();
        System.out.println("运行结束");

    }
}
