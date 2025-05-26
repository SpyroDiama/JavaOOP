package Homework3;

//Printed book class that extends to book.
public class PrintedBook extends Book {
    int pages;
    String publisher;
    int copies;
    String printType;

    //Printed book constructor.
    public PrintedBook(String title, String author, double price, int ISBN, String publisher, int copies, String printType, int pages) {
        super(title, author, ISBN, price);
        this.publisher = publisher;
        this.copies = copies;
        this.printType = printType;
        this.pages = pages;

    }

    //To string to show class attributes (commas too because it looked bad on output).
    public String toStringPrint(){
        return ", Book print type is: " + printType + ", Number of pages is: " + pages +  ", Number of copies is: " + copies + ", Book Publisher: " + publisher;

    }

    //Calling to string from parent class by using super to string with current class string.
    public String toString(){
        return super.toString() + toStringPrint();
    }

}
