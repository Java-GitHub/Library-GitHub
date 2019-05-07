package modelsManagement;

import java.util.ArrayList;
import java.util.Scanner;

import exceptions.LoanAlreadyExistsException;
import exceptions.LoanNotFoundException;
import models.Book;
import models.Customer;
import models.Loan;
import utilities.LoanStatus;

public class LoansRegistry {
	
	private ArrayList<Loan> registry;
	static Scanner sc = new Scanner(System.in);
	CustomerRecords cRecords = new CustomerRecords();
	BookCatalog bCatalog = new BookCatalog();
	
	public LoansRegistry() {
		registry = new ArrayList<Loan>();
	}
	
	public void addLoan(Loan loan) throws LoanAlreadyExistsException
	{
		if(registry.contains(loan))
		{
			throw new LoanAlreadyExistsException();
		}
		
		registry.add(loan);
		
	}
	
	public Loan findLoan(String bookID) throws LoanNotFoundException
	{
		for (Loan loan : registry)
		{		
			if (loan.getBook().getID().equals(bookID) && loan.getStatus() == LoanStatus.CURRENT)
			{
				return loan;
			}
		}
		throw new LoanNotFoundException();
	}
	
	public boolean isBookOnLoan(String bookID)
	{
		try
		{
			Loan foundLoan = findLoan(bookID);
			return true;
		}
		catch (LoanNotFoundException e)
		{
			return false;
		}
		
	}
	
	public void addLoan1() {
		System.out.println("Loan Id: ");
		int loanId = sc.nextInt();
		sc.nextLine();
		Customer customer = cRecords.addCustomer();
		Book book = bCatalog.addBook();
		Loan loan = new Loan(loanId, customer, book);
		registry.add(loan);
	}
	
	public void removeLoan() {
		System.out.print("Enter book id: ");
		String bookId = sc.nextLine();
		
		for (Loan loan : registry)
		{
			if (loan.getBook().getID().equals(bookId) && loan.getStatus() == LoanStatus.CURRENT)
			{
				loan.endLoan();
			}
		}
	}

	@Override
	public String toString() {
		return "LoansRegistry [registry=" + registry + ", cRecords=" + cRecords + ", bCatalog=" + bCatalog + "]";
	}

	
}
