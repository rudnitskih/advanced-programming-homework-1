package task1;

import lombok.SneakyThrows;
import task1.mails.EmailsRegistry;
import task1.mails.Mail;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rudnitskih on 10/13/17.
 */
class MailSender {
    private Map<Integer, Mail> initializedMails = new HashMap<Integer, Mail>();

    @SneakyThrows
    MailSender() {
        for (Class MailClass : EmailsRegistry.mailClasses) {
            if (Mail.class.isAssignableFrom(MailClass)) {
                Mail mailInstance = (Mail) MailClass.newInstance();
                Integer mailCode = mailInstance.getMailCode();

                if (initializedMails.containsKey(mailCode)) {
                    throw new Exception("Cannot register two emails types with code " + mailCode);
                } else {
                    initializedMails.put(mailCode, mailInstance);
                }
            } else {
                throw new Exception(
                    MailClass.toString()
                        + " should implement "
                        + Mail.class.toString()
                        + " interface"
                );
            }
        }

    }

    void send(Integer code) {
        initializedMails.get(code).send();
    }
}
