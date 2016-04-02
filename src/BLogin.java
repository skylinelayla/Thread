/**
 * Created by SHIKUN on 2016/4/2.
 */
public class BLogin extends Thread {
    public void run() {
        LoginServlet.doPost("b", "212");

    }

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();

    }
}
