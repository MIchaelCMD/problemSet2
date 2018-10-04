public class Message {

    private String sender, recipient, emailBody;

    public Message(String sender, String recipient) {

        this.sender = sender;
        this.recipient = recipient;
        this.emailBody = "";
    }

    //Set Methods

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    //Get Methods

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public String toString() {
        return "From: " + this.sender + "\nTo: " + this.recipient + "\nEmail: " + this.emailBody;
    }

    public void append(String text)
    {
        this.emailBody += text;
    }
}
