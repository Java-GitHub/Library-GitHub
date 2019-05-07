package switches;

import java.util.Scanner;

import modelsManagement.CustomerRecords;

public class SwitchCustomer {
	
    public static Scanner sc = new Scanner(System.in);
    UserInput userInput = new UserInput();
    
    public void menu() throws Exception {
    	CustomerRecords customerRecords = new CustomerRecords();
        boolean option = true;
        do {
            System.out.println("Please Enter your Choice");
            System.out.println("1. to add a Customer");
            System.out.println("2. to remove a Customer");
            System.out.println("3. to search a Customer");
            System.out.println("4. Number of Customers");
//            System.out.println("5. to update age");
            System.out.println("6. show all Customers");
//            System.out.println("7. show By Id");
            System.out.println("8. Exit");
            int choice = userInput.inputNumber();
            switch (choice) {
                case 1: {
                    customerRecords.addCustomer();
                    break;
                }
                case 2: {
//                    System.out.println("Enter Id of the Artist");
//                    int artistId = userInput.inputNumber();
                    customerRecords.deleteCustomer();
                    break;
                }
                case 3: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
//                    bookCatalog.updatefName(artistId);
                	  customerRecords.searchCustomer();
                    break;
                }
                case 4: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
                	customerRecords.getNumberOfCustomers();
                    break;
                }
//                case 5: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
//                    bookCatalog.updateAge(artistId);
//                    break;
//                }
                case 6: {
                    System.out.println("Show all Customers");
                    customerRecords.printAllCustomers();
                    break;
                }
//                case 7: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
//                    bookCatalog.findById(artistId);
//                    break;
//                }
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



}
