package Pages;

/**
 * Created by Admin on 24.03.2017.
 */
public class Mail {
    private final String username;
    private final String subject;
    private final String body;

     Mail(MailBuilder mailBuilder){
        this.username=mailBuilder.getUsername();
        this.subject=mailBuilder.getSubject();
        this.body=mailBuilder.getBody();
    }
}
