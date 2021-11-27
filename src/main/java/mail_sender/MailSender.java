package mail_sender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mail_info.MailInfo;

@Getter @AllArgsConstructor
public class MailSender {

    public void sendMail(MailInfo info){
        String logRecieverInfo = "[RECIEVER]:\nNAME: " + info.getClient().getName() +
                "\nAGE: " + info.getClient().getAge() +
                "\nID: " + info.getClient().getId() +
                "\nSEX: " + info.getClient().getSex();
        String logMsgInfo = "\n[MESSAGE]:\n" + info.buildMail();
        System.out.println(logRecieverInfo + logMsgInfo);
    }
}
