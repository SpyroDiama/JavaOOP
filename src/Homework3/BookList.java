package Homework3;

//Importing Arrays since we need a book list to display later to the user.

import java.util.ArrayList;

//Our clas for the book list and starting the array.
public class BookList {
        public ArrayList<Book> books;

        public BookList() {
            books = new ArrayList<>();
        }

        //Method to add books.
        public void addBook(Book book) {
            books.add(book);
        }

        //Method to print books from the list.
        public void printBooks() {
            for (Book book : books) {
                System.out.println(book);
            }
        }
}
