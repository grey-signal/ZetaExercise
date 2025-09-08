package tech.zeta.exercise.sept8.A1;

import java.util.Comparator;

public class Book implements Comparable<Book> {

    private  String title;
    private  String author;
    private  double price;

    public Book(String title, String author, double price){

        this.title = title;
        this.author = author;
        this.price = price;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public  void setAuthor(String author) {
        this.author = author;
    }

    public  void setPrice(double price) {
        this.price = price;
    }

    public  String getAuthor() {
        return author;
    }

    public  double getPrice() {
        return price;
    }

    public  String getTitle() {
        return title;
    }


    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return title + " by " + author + " ($" + price + ")";
    }

}
