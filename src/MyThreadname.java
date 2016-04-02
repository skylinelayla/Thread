/**
 * Created by SHIKUN on 2016/4/2.
 */
public class MyThreadname extends Thread {
    public MyThreadname() {
        System.out.println("构造方法的进程" + Thread.currentThread().getName());

    }
    public void run() {
        System.out.println("run方法的进程" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        MyThreadname myThreadname = new MyThreadname();//被main函数调用
        myThreadname.start();


    }
}
