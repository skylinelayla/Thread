/**
 * Created by SHIKUN on 2016/4/2.
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized  public static void doPost(String username, String passwd) {
        try {
            usernameRef = username;
            if (username == "a") {
                Thread.sleep(5000);
            }
            passwordRef = passwd;
            System.out.println("username=" + usernameRef + "password=" + passwd);

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
