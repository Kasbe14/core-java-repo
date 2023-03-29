package com.javahelloworld;

public class BookInformation {
//	class's variables or instance variables, properties;
	int bookId;
	String bookTitle;
	String bookAuthor;
	int bookPrice;
	int bookPages;
	String bookPublication;
	int bookPublishYear;
	
// public method of class that prints all the information of the book;
	public void printBookInfo() {
		System.out.println("Id = "+bookId);
		System.out.println("Title = "+bookTitle);
		System.out.println("Author = "+bookAuthor);
		System.out.println("Price = "+bookPrice+" Rs");
		System.out.println("Pages = "+bookPages);
		System.out.println("Publication = "+bookPublication);
		System.out.println("Year = "+bookPublishYear);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		object -> instance of class;
//		object 1 of the class
		BookInformation book1 = new BookInformation();
		
//		object 2 of the class
		BookInformation book2 = new BookInformation();
// assigned values to the object 1
		book1.bookId = 456;
		book1.bookTitle = "Maths";
		book1.bookAuthor = "J.K";
		book1.bookPrice = 250;
		book1.bookPages = 225;
		book1.bookPublication = "orange publication";
		book1.bookPublishYear = 2019;
//		assign value to object 2
		book2.bookId = 1102;
		book2.bookTitle = "Physics";
		book2.bookAuthor = "K.k.k";
		book2.bookPrice = 360;
		book2.bookPages = 525;
		book2.bookPublication = "Blue publication";
		book2.bookPublishYear = 2020;
		
//		calling the print method for both the objects;
		
		book1.printBookInfo();
		System.out.println('\n');
		book2.printBookInfo();
	}

}
