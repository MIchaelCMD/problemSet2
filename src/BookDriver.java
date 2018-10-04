public class BookDriver {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setIsbn("13re43ty5u");
        book1.setPageNum(344);
        book1.setPrice(17.43);
        book1.setTitle("The Chamber of Secrets");

        //System.out.print(book1.getIsbn() + "\n" + book1.getTitle() + "\n" + book1.getPageNum() + "\n" + book1.getPrice());
        System.out.print(book1.toString());
    }
}
