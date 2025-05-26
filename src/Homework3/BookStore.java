package Homework3;

//Main function class.
public class BookStore {
    public static void main(String[] args) {
        BookList bookList = new BookList();
    //Giving Some Array Data for the display 1 of each type of book.
        bookList.addBook(new AudioBook(23451, "The Horus Heresy", "Games Workshop", 35.99, 987-132-231, "George Davis", 120));
        bookList.addBook(new DigitalBook("Invincible", "Garth Enis", 126-334-756, 15.99, 340));
        bookList.addBook(new PrintedBook("The Amazing Spiderman", "Stan Lee", 10.99, 899-023-304, "MARVEL", 123, "Paperback", 32));


    //print books.
        bookList.printBooks();
        System.out.println("These are the available books alongside their details.");


    }

}

