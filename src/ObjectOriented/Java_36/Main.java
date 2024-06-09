package ObjectOriented.Java_36;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2000);
        Date date2 = new Date(2, 2, 2002);
        Date date3 = new Date(3, 3, 2003);

        Manufacture manufacture1 = new Manufacture("Manufacture1", "Country1");
        Manufacture manufacture2 = new Manufacture("Manufacture2", "Country2");
        Manufacture manufacture3 = new Manufacture("Manufacture3", "Country3");

        Movie movie1 = new Movie("Movie1", 2000, manufacture1, 100, date1);
        Movie movie2 = new Movie("Movie2", 2002, manufacture2, 200, date2);
        Movie movie3 = new Movie("Movie3", 2003, manufacture3, 300, date3);

        System.out.println(movie1.inNameManufacture());
        System.out.println(movie2.inNameManufacture());
        System.out.println(movie3.inNameManufacture());

        System.out.println(movie1.checkPrice(movie2));
        System.out.println(movie3.checkPrice(movie2));

        System.out.println(movie1.checkPublishingYear(movie2));

        System.out.println(movie1.priceAfterDiscount(10));
        System.out.println(movie2.priceAfterDiscount(20));
    }
}
