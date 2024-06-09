package ObjectOriented.Java_36;


public class Movie {
    private String name;
    private int publishingYear;
    private Manufacture manufacture;
    private double price;
    private Date date;


    public boolean checkPrice(Movie movie) {
        return this.price > movie.price;
    }

    public String checkPublishingYear(Movie movie) {
        if (this.publishingYear > movie.publishingYear) {
            return this.name + " is newer than " + movie.name;
        } else if (this.publishingYear < movie.publishingYear) {
            return this.name + " is older than " + movie.name;
        } else {
            return this.name + " is the same age as " + movie.name;
        }
    }

    public double priceAfterDiscount(int discount) {
        return this.price - (this.price * discount / 100);
    }

    public String inNameManufacture() {
        return this.manufacture.getName();
    }

    public Movie(String name, int publishingYear, Manufacture manufacture, double price, Date date) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.manufacture = manufacture;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "PublishingYear = " + publishingYear + '\n' +
                "Manufacture = " + manufacture + '\n' +
                "Price = " + price + '\n' +
                "Date = " + date;
    }
}
