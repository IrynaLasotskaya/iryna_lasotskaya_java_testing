package model;

/**
 * Created by Admin on 24.03.2017.
 */
public class MailBuilder {
    private String username;
    private String subject;
    private String body;

    public MailBuilder username (final String username) {
        this.username = username;
        return this;
    }

    public MailBuilder subject (final String subject) {
        this.subject = subject;
        return this;
    }

    public MailBuilder body(final String body) {
        this.body = body;
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

    public Mail build() {
        return new Mail(this);
    }

}
