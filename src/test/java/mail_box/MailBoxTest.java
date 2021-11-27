package mail_box;

import client.Client;
import client.Gender;
import mail_info.MailInfo;
import mail_info.mailCode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MailBoxTest {
    private Client c1 = new Client("Stephen", 22, Gender.MALE);
    private Client c2 = new Client("Mary", 23, Gender.FEMALE);
    private MailInfo info1 = new MailInfo(c1, mailCode.BIRTHDAY_MAIL);
    private MailInfo info2 = new MailInfo(c2, mailCode.SALE_MAIL);
    private MailBox box = new MailBox();

    @Test
    void addMailInfo() {
        box.addMailInfo(info1);
        assertEquals(1, box.getInfos().size());
        box.addMailInfo(info2);
        assertEquals(2, box.getInfos().size());

        ArrayList<MailInfo> infosPrototype = new ArrayList<>();
        infosPrototype.add(info1);
        infosPrototype.add(info2);
        assertEquals(infosPrototype, box.getInfos());
    }

    @Test
    void sendAll() {
        box.sendAll();
        assertEquals(0, box.getInfos().size());
    }
}