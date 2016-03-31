/**
 * Created by SHIKUN on 2016/3/31.
 */
public class Mythread extends Thread {
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        try {
            Mythread thread = new Mythread();
            thread.setName("Mythread");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("Main=" + Thread.currentThread().getName());

            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

}
