package com.gla.Encapsulation;
abstract class LibraryItem {
    String title;

    LibraryItem(String t) {
        title = t;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println(title);
    }
}

class Book extends LibraryItem {
    Book(String t) { super(t); }

    int getLoanDuration() { return 14; }
}

class Magazine extends LibraryItem {
    Magazine(String t) { super(t); }

    int getLoanDuration() { return 7; }
}
public class LibraryMain {
    public static void main(String[] args) {
        LibraryItem b = new Book("Java");
        System.out.println(b.getLoanDuration());
    }
}
