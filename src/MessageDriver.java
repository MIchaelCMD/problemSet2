import javax.swing.*;

public class MessageDriver {
    public static void main(String[] args) {

        Message m = messageConstruct();
        m.append(append());
        JOptionPane.showMessageDialog(null,m.toString());


    }

    public static Message messageConstruct() {


        String sender = JOptionPane.showInputDialog("Enter the sender for email: ");
        String recipient = JOptionPane.showInputDialog("Enter the recipient of this email: ");

        Message newMessage = new Message(sender,recipient);

        return newMessage;
    }

    public static String append() {

        String text = JOptionPane.showInputDialog("Enter your email text: ");
        return text;
    }
}
