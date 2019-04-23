package ui;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import models.Book;
import models.BookCatalog;
import models.BookNotFoundException;
import models.Customer;
import models.DVD;
import utilities.GenderType;

public class Main {

	public static void main(String[] args) {
		
		/*Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MMM-dd");
		GregorianCalendar gCal = new GregorianCalendar(2019,0,1);
//		System.out.println(gCal);
		today = gCal.getTime();
		System.out.println(sdf.format(today));*/
		
		Customer customer = new Customer("ABC", "XYZ", "Street 1", "0700054321", "abc2xyz.com", 1, GenderType.MALE);
		System.out.println(customer.getExpiryDate());
		System.out.println(customer.getMailingName());

		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1, "Intro To Java", "Deitel", "12345", "Main", 200);
		Book book2 = new Book(2, "Intro To C++", "Deitel", "23456", "Main", 300);
		
		DVD dvd1 = new DVD(1, "Documentary 1", "Main", "Director 1", "101", 40);
		DVD dvd2 = new DVD(1, "Documentary 1", "Main", "Director 1", "101", 40);

		System.out.println("compare two DVD's");
		System.out.println(dvd1.equals(dvd2));

		
		System.out.println(dvd1.getTitle());
		
		book1.relocate("Kista");
		
		System.out.println(dvd1.lend(customer));
		dvd1.licence();
		System.out.println(dvd1.lend(customer));
		System.out.println(dvd1.lend(customer));

		
		
		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		UI ui = new UI();

		ui.printHeader();
		
		ui.printbookCatelog(bookCatalog.getBookArray());
		
		System.out.println(book1.lend(customer));
		System.out.println(book1.lend(customer));
		
		try
		{
			Book foundBook = bookCatalog.findBook("Intro To C++");			
			System.out.println("We found " + foundBook.getTitle());
		}
		catch (BookNotFoundException e)
		{
			System.out.println("Book wasn't found");
		}
		
//		double d = 1.2345;
//		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//		System.out.println(nf.format(d));
		
		System.out.println(book1.getLoanPeriod());
		System.out.println(dvd1.getLoanPeriod());
		
	}
}
