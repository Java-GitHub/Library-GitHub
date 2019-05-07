package modelsManagement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;
import exceptions.BookNotFoundException;
import models.Book;

public class BookCatalog {
	
	static Scanner sc = new Scanner(System.in);
	
	private TreeMap<String, Book> bookMap;
	
	public BookCatalog()
	{
		bookMap = new TreeMap<String, Book>();
	}

	public TreeMap<String, Book> getBookMap() {
		return bookMap;
	}
	
	public int getNumberOfBooks() {
		System.out.println("Total number of books");
		return bookMap.size();
	}

	public Book addBook() {
		
		System.out.println("Book's id: ");
		String bookId = sc.nextLine();
		System.out.println("Book title: ");
		String title = sc.nextLine();
		System.out.println("Book Author: ");
		String author = sc.nextLine();
		System.out.println("Book ISBN: ");
		String isbn = sc.nextLine();
		System.out.println("Book's Library Branch: ");
		String branch = sc.nextLine();
		System.out.println("Book's Pages: ");
		int pages = sc.nextInt();
		sc.nextLine();
		
		Book book = new Book(bookId, title, author, isbn, branch, pages);
		
		bookMap.put(book.getID(), book);
		
		return book;
	}
	
	public void deleteBook()
	{
		System.out.println("\nBy which way you want to delete a Book?");
		System.out.println("1. by title");
		System.out.println("2. by id (id is String)");
		System.out.print("\nYour choice:");
		int rmChoice = sc.nextInt();
		sc.nextLine();
		removeBook(rmChoice);
	}
	public void removeBook(int rmChoice)
	{
		if (rmChoice == 1)
		{
			System.out.println("Book title: ");
		    String name = sc.nextLine();
		    
			for (Book nextBook : bookMap.values()) {
				
				if (nextBook.getTitle().equalsIgnoreCase(name))
				{
					bookMap.remove(nextBook);
					System.out.println("Book is removed ");
				}
				
			}
		    
		}
		if (rmChoice == 2)
		{
			System.out.println("Book Id: (id is String) ");
		    String id = sc.nextLine();
		    
			for (Book nextBook : bookMap.values()) {
				
				if (nextBook.getID().equalsIgnoreCase(id))
				{
					bookMap.remove(id, nextBook);
					System.out.println("Book with is removed ");
				}
			}
		}
	}
	
	public void searchBook() {
		System.out.println("\nBy which way you want to search an Employee?");
		System.out.println("1. by title");
		System.out.println("2. by id (id is String)");
		System.out.print("\nYour choice:");
		int searchChoice = sc.nextInt();
		sc.nextLine();
		searchByChoice(searchChoice);
	}

	public void searchByChoice(int searchChoice) {
		if (searchChoice == 1) {
			System.out.println("Book title: ");
			String name = sc.nextLine();

			for (Book nextBook : bookMap.values()) {

				if (nextBook.getTitle().equalsIgnoreCase(name)) {
					System.out.println("Book with title: " + name);
					System.out.println(nextBook);
				}
			}
		}
			if (searchChoice == 2) {

				System.out.println("Book Id: (id is String)");
				String id = sc.nextLine();

				for (Book nextBook : bookMap.values()) {

					if (nextBook.getID().equalsIgnoreCase(id)) {
						System.out.println("Book with id: " + id);
						System.out.println(nextBook.toString());
					}
				}
			}
	}

	public Book findBook(String title) throws BookNotFoundException {
		
		title = title.trim();
		
		for (Book nextBook : bookMap.values())
		{
			if (nextBook.getTitle().equalsIgnoreCase(title)) {
				return nextBook;
			}
		}
		throw new BookNotFoundException();
	}
	
	public void printAllBooks () {
		
		for (Book nextBook : bookMap.values()) {
			System.out.println(nextBook.toString());
		}
	}
	
}
