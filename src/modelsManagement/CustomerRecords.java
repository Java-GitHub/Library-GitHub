package modelsManagement;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import exceptions.CustomerNotFoundException;
import models.Customer;
import utilities.GenderType;

public class CustomerRecords {

	static Scanner sc = new Scanner(System.in);

	private HashSet<Customer> records;

	public CustomerRecords() {
		records = new HashSet<Customer>();
	}

	public HashSet<Customer> getRecords() {
		return records;
	}

	public int getNumberOfCustomers() {
		System.out.println("Number of Customers");
		System.out.println(records.size());
		return records.size();
	}

	public Customer addCustomer() {
		System.out.println("First Name: ");
		String fName = sc.nextLine();
		System.out.println("Last Name: ");
		String lName = sc.nextLine();
		System.out.println("Address: ");
		String address = sc.nextLine();
		System.out.println("Phone Number: ");
		String phoneNr = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Customer Number: ");
		int customerNr = sc.nextInt();
		sc.nextLine();
		System.out.println("Gender Type MALE, FEMALE or UNKNOWN: ");
		String st = sc.nextLine();
		GenderType gender = GenderType.valueOf(st);

		Customer customer = new Customer(fName, lName, address, phoneNr, email, customerNr, gender);

		records.add(customer);
		
		return customer;

	}

	public Customer findByName(String name) throws CustomerNotFoundException {
		for (Customer customer : records) {
			if (customer.getMailingName().equals(name)) {
				return customer;
			}
		}
		throw new CustomerNotFoundException();
	}

	public void deleteCustomer() {
		System.out.println("\nBy which way you want to delete a Customer?");
		System.out.println("1. by First name");
		System.out.println("2. by id");
		System.out.print("\nYour choice:");
		int rmChoice = sc.nextInt();
		sc.nextLine();
		removeCustomer(rmChoice);
	}

	public void removeCustomer(int rmChoice)

	{
		if (rmChoice == 1) {
			System.out.println("Customer's first name: ");
			String fname = sc.nextLine();

			Iterator<Customer> iter = records.iterator();
			while (iter.hasNext()) {
				if (iter.next().getFirstName().equalsIgnoreCase(fname)) {
					iter.remove();
					System.out.println("Customer is removed ");

				}
			}

//			for (Customer nextCustomer : records) {
//
//				if (nextCustomer.getFirstName().equalsIgnoreCase(fname)) {
//					records.remove(nextCustomer);
//				}
//
//			}

		}
		if (rmChoice == 2) {
			System.out.println("Customer Id: ");
			int customerNo = sc.nextInt();
			sc.nextLine();

			Iterator<Customer> iter = records.iterator();
			while (iter.hasNext()) {
				if (iter.next().getCustomerNumber() == customerNo) {
					iter.remove();
					System.out.println("Customer is removed ");

				}
			}

//			for (Customer nextCustomer : records) {
//
//				if (nextCustomer.getCustomerNumber() == customerNo) {
//					records.remove(nextCustomer);
//				}
//
//			}

		}
	}

	public void searchCustomer() {
		System.out.println("\nBy which way you want to search a Customer?");
		System.out.println("1. by name");
		System.out.println("2. by id");
		System.out.print("\nYour choice:");
		int searchChoice = sc.nextInt();
		sc.nextLine();
		searchByChoice(searchChoice);
	}

	public void searchByChoice(int searchChoice) {
		if (searchChoice == 1) {
			System.out.println("Customer's First name: ");
			String fName = sc.nextLine();

			for (Customer nextCustomer : records) {

				if (nextCustomer.getFirstName().equalsIgnoreCase(fName)) {
					System.out.println("Customer with First Name: " + fName);
					System.out.println(nextCustomer.toString());
				}
			}
		}
		if (searchChoice == 2) {

			System.out.println("Customer Id: ");
			int customerNo = sc.nextInt();
			sc.nextLine();

			for (Customer nextCustomer : records) {

				if (nextCustomer.getCustomerNumber() == customerNo) {
					System.out.println("Customer with id: " + customerNo);
					System.out.println(nextCustomer.toString());
				}
			}
		}
	}

	public void printAllCustomers() {

//		Iterator<Customer> iter = records.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.toString());
//		}

		for (Customer nextCustomer : records) {
			System.out.println(nextCustomer.toString());
		}
	}

}
