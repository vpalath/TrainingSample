package com.paypal.samples.Trainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
	
	private Long bookid;
	private  String title;
	private String genre;
	private float price;
	
	public Book(long id ,String title,String genre,float price){
		
		this.bookid = id;
		this.title = title;
		this.genre = genre;
		this.price = price;
		
	}

	@Override
	public int compareTo(Book b1) {
		
		if(this.price >b1.price ){
			return 1;
		}
		else if(this.price < b1.price){
			return -1;
		}
		else return 0;
			
		
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", genre=" + genre + ", price=" + price + "]";
	}
 
	
	public static void main(String[]args){
		Book b1 = new Book(2000L,"Visit Java","Tourism",250);
		Book b2 = new Book(2000L,"Visit Singapore","Tourism",450);
		Book b3 = new Book(2000L,"Visit Java","Tourism",100);
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		List<Book> bookList = new ArrayList<>();
	    bookList.add(b1);
	    bookList.add(b2);
	    bookList.add(b3);
		
	    
		
		System.out.println("Without SOrt--------------------");
		for(Book book :bookList ){
			System.out.println(book);
		}
		
		Collections.sort(bookList);
		
		System.out.println("With SOrt--------------------");
		for(Book book :bookList ){
			System.out.println(book);
		}
		
		
	}
	
}
