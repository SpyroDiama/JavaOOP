package Homework3;

//Digital book class that extends to book.
public class DigitalBook extends Book {
    public int sizekb;

    //Digital book constructor.
    public DigitalBook(String title, String author, int ISBN, double price, int sizeKB) {
        super(title, author, ISBN, price);
        this.sizekb = sizekb;
    }

    //To string so we can later print the book size.
    public String toStringPrint() {
        return ", Digital Book size in KB: " + sizekb;
    }

    //Calling to string from parent class by using super to string with current class string.
    public String toString() {
        return super.toString() + toStringPrint();
    }
}
