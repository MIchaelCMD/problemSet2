public class Book {

        private String title, isbn;
        private int pageNum;
        private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPageNum() {
        return pageNum;
    }

    public double getPrice() {
        return price;
    }

    public Book() {

    }
}
