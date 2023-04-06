package com.text.java;

public class BookInformation {
	

	int id ;
	String BookName ;
	String AuthorName ;
	int price;
	int NumberOfPages ;
	String PublicationName ;
	int IsbnNumber;
	
	public void BookInformation() {
		System.out.println("This is Book Information");
	}
	
	 public static void main(String[] args) {
		 BookInformation ob=new BookInformation();
		 ob.id=23324;
		 ob.BookName = "Goodfather";
		 ob.AuthorName = "David";
		 ob.price = 500;
		 ob.NumberOfPages = 400;
		 ob.PublicationName = "Rainbow";
		 ob.IsbnNumber = 765646;
		 
		 System.out.println(ob.id+" " +ob.BookName+" " +ob.AuthorName+" " +ob.price+" " 
				 			+ob.NumberOfPages+" " +ob.PublicationName+" " +ob.IsbnNumber+" ");
				 
	 }
	
	
	
	


}
