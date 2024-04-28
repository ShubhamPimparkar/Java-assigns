package com.book;

public class Book {
	private int  bookid;
	private String title;
	private String author;
	private boolean isAvail;
	private static int count=0;	
	
	public Book(int bookid,String title,String author, boolean isAvail ) {
		
		count++;
		this.bookid=bookid;
		this.title=title;
		this.author=author;
		this.isAvail=isAvail;
		
	}
	public static void totalBooks() {
		System.out.println("Total Books - "+count);		
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", isAvail=" + isAvail + "]";
	}
	
}
