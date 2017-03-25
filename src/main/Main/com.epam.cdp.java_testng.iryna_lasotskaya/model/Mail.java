package model;

import model.MailBuilder;

/**
 * Created by Admin on 24.03.2017.
 */
public class Mail {
    private final String username;
    private final String subject;
    private final String body;

    public String getUsername() {
        return username;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    Mail(MailBuilder mailBuilder){
        this.username=mailBuilder.getUsername();
        this.subject=mailBuilder.getSubject();
        this.body=mailBuilder.getBody();

    }

}
