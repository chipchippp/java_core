package ObjectOriented.Java_35;

import java.util.Scanner;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int publishingYear;

    public void inTenSach(){
        System.out.println(this.name);
    }
    public boolean checkPublishingYear(Book bookYear){
        return this.publishingYear == bookYear.publishingYear;
    }

    public double priceAfterDiscount(double discount){
        return this.price - (this.price * discount / 100);
//        giải thích: giảm giá 10% thì giá sau giảm = giá trước giảm - giá trước giảm * 10 / 100
    }

    public Book(String name, Author author, double price, int publishingYear) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return
                "Name = " + name + '\n' +
                "Author = " + author + '\n' +
                "Price = " + price + '\n' +
                "PublishingYear = " + publishingYear;
    }
}
