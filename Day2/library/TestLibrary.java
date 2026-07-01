package library;

import library.Book;
import library.Member;

public class TestLibrary {
    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist");

        Member m1 = new Member("Rahul");
        Member m2 = new Member("Priya");

        m1.issueBook(b1);

        m2.issueBook(b1); 

        b1.status();

        m1.status();

        m2.status();
    }
}