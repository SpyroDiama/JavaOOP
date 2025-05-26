package Homework3;

//Audio book class tht extends to parent class book.
public class AudioBook extends Book {
    public String narrator;
    public int duration;


    //Audio Book Constructor.
    public AudioBook(int id, String title, String author, double price, int ISBN, String narrator, int duration) {
        super(title, author, ISBN, price );
        this.narrator = narrator;
        this.duration = duration;

    }

    //To string for the duration and narrator display. (commas too because it looked bad on output).
    public String ToStringPrint() {
        return ", Audio book duration is: " + duration + " minutes" + ", Narrated by: " + narrator;
    }

    //calling to string from the parent class by using super to string with current class string.
    public String toString() {
        return super.toString() + ToStringPrint();

    }

}
