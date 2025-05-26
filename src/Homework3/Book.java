package Homework3;

//Parent Class book of the other book types.
public class Book {
    public String title;
    public String author;
    public int ISBN;
    public double price;


    //Book class constructor.
    public Book(String title, String author, int ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;

    }

    //To string method so we can return class attributes as strings and will be also called in other subclasses.
    public String toString() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + ", Price: " + price;
    }

}