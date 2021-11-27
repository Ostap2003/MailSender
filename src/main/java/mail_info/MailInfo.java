package mail_info;

import client.Client;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@AllArgsConstructor @Getter
public class MailInfo {
    private Client client;
    private mailCode mailcode;

    public String buildMail() {
        String finalText = mailcode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("<NAME>", client.getName());

        for (String key : templates.keySet()) {
            finalText = finalText.replace(key, templates.get(key));
        }

        return finalText;
    }
}
