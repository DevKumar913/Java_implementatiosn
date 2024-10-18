/*
 * Task 2: Develop a Java class to represent a library, 
 * with a static data member to store the total number of books in the library
 *  and an instance data member to store the book's title. 
 *  Implement a static method to update the total count when a new book is added.
 * 
 */
package com.kumar.Assignments_oops1;

public class Library {
	private static int totalBooks;
	private String title;
	
	public static int getTotalBooks() {
		return totalBooks;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void addBook(String title) {
		this.title=title;
		totalBooks++;
	}
	
	public static void main(String[] args) {
		
		Library library= new Library();
		library.addBook("you can win");
		library.addBook("1947");
		library.addBook("Wings of Fire");
	
		
		System.out.println("Total Books added are : "+ totalBooks);
//		System.out.println("Total Books added are : "+ getTotalBooks());
//		System.out.println("Total Books added are : "+ Library.totalBooks);
//		System.out.println("Total Books added are : "+ Library.getTotalBooks());
//		System.out.println("Total Books added are : "+ book1.totalBooks);
	}
}
