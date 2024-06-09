package ObjectOriented.Java_35;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2000);
        Date date2 = new Date(2, 2, 2002);
        Date date3 = new Date(3, 3, 2003);

        Author author1 = new Author("Author1", date1);
        Author author2 = new Author("Author2", date2);
        Author author3 = new Author("Author3", date3);

        Book book1 = new Book("Book1", author1, 100, 2012);
        Book book2 = new Book("Book2", author2, 200, 2014);
        Book book3 = new Book("Book3", author3, 300, 2016);

        book1.inTenSach();
        book2.inTenSach();
        book3.inTenSach();

        System.out.println(book1.checkPublishingYear(book2));
        System.out.println(book3.priceAfterDiscount(10));
    }
}
