package com.gla.Package_Assignment.Library_Management_System;
import com.gla.Package_Assignment.Library_Management_System.library.books.Book;
import com.gla.Package_Assignment.Library_Management_System.library.members.Member;
import com.gla.Package_Assignment.Library_Management_System.library.transactions.Transaction;
public class MainApp {
    public static void main(String[] args) {
        Book b = new Book();
        Member m = new Member();
        Transaction t = new Transaction();

        b.addBook();
        m.register();
        t.issueBook();
    }
}
