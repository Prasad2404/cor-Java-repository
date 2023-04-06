package com.text.java;


public class Book {
	
	static private String publication="ABC publication";//static variable
	private long id;
	private String name;
	private String author;
	private double price;
	
	public Book()
	{
		System.out.println("Default constructor invoked");
	}
	
	public Book(long id,String name,String author,double price)
	{   
		this();
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
		
		this.displayBookInfo(this);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	public void displayBookInfo(Book book)
	{
		
		System.out.println(book.id+ " "+book.name+" "+book.author+" "+book.price +Book.publication);
	}
	

}