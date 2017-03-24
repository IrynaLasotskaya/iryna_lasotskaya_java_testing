package Pages;

/**
 * Created by Admin on 24.03.2017.
 */
public class MailBuilder {
    protected String username;
    private String subject;
    private String body;
    public MailBuilder(final String username){
        this.username=username;
        return this;
    }
    public MailBuilder(final String subject){
        this.subject=subject;
        return this;
    }
    public MailBuilder(final String body){
        this.body=body;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
    public Mail build(){
        return new Mail(this);
    }
}
