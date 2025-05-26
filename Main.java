package com.main2;
import com.book.Book;
import com.publisher.Publisher;
public class Main {
public static void main(String args[]) {
	Publisher publisher=Publisher.getPublisherObject("O'Reilly", "New York", "PUB12345");
	if (publisher != null) {
        Book book = Book.getBookDetailes("Effective Java", "Joshua Bloch", publisher, 75.0);
        if (book != null) {
            System.out.println("Book Created Successfully!");
            System.out.println(book);
        } else {
            System.out.println("Book creation failed: invalid title, author, or price.");
        }
    } else {
        System.out.println("Publisher creation failed: invalid license code.");
}
}}
