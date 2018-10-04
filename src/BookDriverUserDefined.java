import javax.swing.*;

public class BookDriverUserDefined {

    Book worstBook = new Book();

    public static void main(String[] args) {
    }

    public String worstBookDetails();
    {
        worstBook.setTitle(JOptionPane.showInputDialog("Enter your least favorite book's title: "));
        worstBook.setIsbn(JOptionPane.showInputDialog("Enter your least favorite book's ISBN: "));
        String pageNumString = JOptionPane.showInputDialog("Enter your least favorite book's page number: ");
        String priceString = JOptionPane.showInputDialog("Enter your least favorite book's price: ");

        return worstBook.toString();
    }

}
