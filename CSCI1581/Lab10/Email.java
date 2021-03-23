// Ivan Zelenkov Problem 1 (Email)

public class Email {
    private String subject;
    private String to;
    private String from;
    private String body;

    public Email(String subject, String to, String from, String body) {
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = body;
    }

    public Email(String subject, String to, String from) {
        this.subject = subject;
        this.to = to;
        this.from = from;
        this.body = "";
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void addToBody(String text) {
        this.body = this.body + text;
    }

    public boolean equals(Email other) {
        return this.subject.equals(other.getSubject()) && this.to.equals(other.getTo()) && this.from.equals(other.getFrom()) && this.body.equals(other.getBody());
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getBody() {
        return body;
    }

    public String toString() {
        return String.format("From: %s; To: %s; Subject: %s; Body: %s", this.from, this.to, this.subject, this.body);
    }
}
