package com.book;

public class Client {

	public static void main(String[] args) {
		Book b1 = new Book(213,"Harry","JK",true);
		Book b2 = new Book(763,"garyy","Rahu",false);
		Book b3 = new Book(443,"Potter","K",true);
		Book.totalBooks();
	
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
