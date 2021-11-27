package mail_info;

import java.io.File;
import java.util.Scanner;

public enum mailCode {
    BIRTHDAY_MAIL("src/main/java/txt_files/happy_birthday.txt"), SALE_MAIL("src/main/java/txt_files/sale_mail.txt");

    private String filename;

    mailCode(String filename){
        this.filename = filename;
    }

    public String generateText(){
        String text = "";

        try {
            File file = new File(this.filename);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String wordLine = sc.nextLine();
                text += wordLine + "\n";
            }
            sc.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return text;
    }
}
