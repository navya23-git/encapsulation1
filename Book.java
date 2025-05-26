package com.book;

import com.publisher.Publisher;

public class Book {
	private String title;
	private String author;
	private Publisher publisher;
	private double price;
	public Book(String title,String author,Publisher publisher,double price) {
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.price=price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public Publisher getpublisher() {
		return publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher=publisher;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String toString() {
		return "title:"+title+"\nauthor:"+author+"\npublisher:"+publisher+"\nprice:"+price;
	}
	public static Book getBookDetailes(String title,String author,Publisher publisher,double price) {
		if (title == null || title.isEmpty() || author == null || author.isEmpty()) {
	        return null; 
	    }
		else if(price>50 && price<100) {
			return new Book(title,author,publisher,price);
		}
		else{
			return null;
		}
		
	}
}
