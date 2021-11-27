package mail_info;

import client.Client;
import client.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {

    @Test
    void buildMail() {
        Client c1 = new Client("Stephen", 22, Gender.MALE);
        MailInfo mailInfo1 = new MailInfo(c1, mailCode.BIRTHDAY_MAIL);
        MailInfo mailInfo2 = new MailInfo(c1, mailCode.SALE_MAIL);

        String finalText1 = mailInfo1.buildMail();
        String finalText2 = mailInfo2.buildMail();

        assertEquals("Happy birthday Stephen!\n", finalText1);
        assertEquals("Hi Stephen, there is a sale!\n", finalText2);
    }
}