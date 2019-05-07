package ui;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import exceptions.LoanAlreadyExistsException;
import interfaces.MaterialCatalogInterface;
import models.Book;
import models.Customer;
import models.Dvd;
import models.Loan;
import modelsManagement.LoansRegistry;
import modelsManagement.MaterialCatalog;
import switches.SwitchBook;
import switches.SwitchCustomer;
import switches.SwitchDvd;
import switches.SwitchLoan;
import switches.UserInput;
import utilities.GenderType;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) throws Exception {
		
	    SwitchBook sBook = new SwitchBook();
	    SwitchDvd sDVD = new SwitchDvd();
	    SwitchCustomer sCustomer = new SwitchCustomer();
	    SwitchLoan sLoan = new SwitchLoan();
	    UserInput userInput = new UserInput();
	    
//	    public void menu() throws Exception {
	        boolean option = true;
	        do {
	            System.out.println("Please Enter your Choice");
	            System.out.println("1. for Book: ");
	            System.out.println("2. for DVD: ");
	            System.out.println("3. for Customer: ");
	            System.out.println("4. for Loan: ");
	            System.out.println("8. for Exit: ");
	            
	            int choice = userInput.inputNumber();
	            switch (choice) {
	                case 1: {
	                    sBook.menu();
	                    break;
	                }
	                case 2: {
//	                    System.out.println("Enter Id of the Artist");
//	                    int artistId = userInput.inputNumber();
	                    sDVD.menu();
	                    break;
	                }
	                case 3: {
//	                    System.out.println("Enter Id of the artist");
//	                    int artistId = userInput.inputNumber();
	                    sCustomer.menu();
	                    break;
	                }
	                case 4: {
//	                    System.out.println("Enter Id of the artist");
//	                    int artistId = userInput.inputNumber();
	                    sLoan.menu();
	                    break;
	                }
//	                case 5: {
//	                    System.out.println("Enter Id of the artist");
//	                    int artistId = userInput.inputNumber();
//	                    bookCatalog.updateAge(artistId);
//	                    break;
//	                }
//	                case 6: {
//	                    System.out.println("Show all Customers");
//	                    loansRegistry.printAllCustomers();
//	                    break;
//	                }
//	                case 7: {
//	                    System.out.println("Enter Id of the artist");
//	                    int artistId = userInput.inputNumber();
//	                    bookCatalog.findById(artistId);
//	                    break;
//	                }
	                case 8: {
	                    option = false;
	                    break;
	                }
	                default : {
	                    System.out.println("Enter a valid input");
	                    break;
	                }
	            }
	        } while (option);
	    }
		
		
		
		
		
//        Switch sw = new Switch();
//		  SwitchDvd sw = new SwitchDvd();
//		  SwitchCustomer sw = new SwitchCustomer();
//		SwitchLoan sw = new SwitchLoan();
//		  
//        try
//        {
//        sw.menu();
//        }
//        catch (Exception e)
//        {
//        	System.out.println("Exception" +e);
//        }
//        
//	}
}
