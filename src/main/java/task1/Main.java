package task1;

/**
 * Created by rudnitskih on 10/13/17.
 */
public class Main {
    public static void main(String[] args) {
        MailSender mailSender = new MailSender();

        mailSender.send(1);
        mailSender.send(2);
    }
}
