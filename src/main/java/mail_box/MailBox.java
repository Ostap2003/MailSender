package mail_box;

import lombok.AllArgsConstructor;
import lombok.Getter;
import mail_info.MailInfo;
import mail_sender.MailSender;

import java.util.ArrayList;

@Getter
public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<>();
    private MailSender sender = new MailSender();

    public void addMailInfo(MailInfo newMail) {
        this.infos.add(newMail);
    }

    public void sendAll() {
        for (MailInfo mail : infos){
            sender.sendMail(mail);
        }
        infos.clear();
    }
}
