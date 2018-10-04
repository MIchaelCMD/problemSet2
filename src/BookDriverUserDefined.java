import javax.swing.*;

public class BookDriverUserDefined {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Worst Book\n-------------------\n" + worstBookDetails() + "\n\nFavourite Book\n-------------------\n" + FavBookDetails());
    }

    public static String worstBookDetails()
    {
        Book worstBook = new Book();

        worstBook.setTitle(JOptionPane.showInputDialog("Enter your least favorite book's title: "));
        worstBook.setIsbn(JOptionPane.showInputDialog("Enter your least favorite book's ISBN: "));
        worstBook.setPageNum(Integer.parseInt(JOptionPane.showInputDialog("Enter your least favorite book's page number: ")));
        worstBook.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter your least favorite book's price: ")));

        return worstBook.toString();
    }

    public static String FavBookDetails()
    {
        Book favBook = new Book();

        favBook.setTitle(JOptionPane.showInputDialog("Enter your favorite book's title: "));
        favBook.setIsbn(JOptionPane.showInputDialog("Enter your favorite book's ISBN: "));
        favBook.setPageNum(Integer.parseInt(JOptionPane.showInputDialog("Enter your favorite book's page number: ")));
        favBook.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Enter your favorite book's price: ")));

        return favBook.toString();
    }

}
