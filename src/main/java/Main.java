import client.Client;
import client.Gender;
import mail_box.MailBox;
import mail_info.MailInfo;
import mail_info.mailCode;

public class Main {
    public static void main(String[] args){
        // some tests
        Client c1 = new Client("Ostap", 18, Gender.MALE);
        Client c2 = new Client("Stephen", 28, Gender.MALE);

        MailInfo mailInfo1 = new MailInfo(c1, mailCode.BIRTHDAY_MAIL);
        MailInfo mailInfo2 = new MailInfo(c2, mailCode.SALE_MAIL);

        MailBox mailBox = new MailBox();

        // add mailinfos to mailbox
        mailBox.addMailInfo(mailInfo1);
        mailBox.addMailInfo(mailInfo2);

        mailBox.sendAll();
    }
}
