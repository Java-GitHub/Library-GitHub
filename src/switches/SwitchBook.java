package switches;

import java.util.Scanner;

import modelsManagement.BookCatalog;
import modelsManagement.LoansRegistry;

public class SwitchBook {

    public static Scanner sc = new Scanner(System.in);
    UserInput userInput = new UserInput();
    
    public void menu() throws Exception {
    	BookCatalog bookCatalog = new BookCatalog();
        boolean option = true;
        do {
            System.out.println("Please Enter your Choice");
            System.out.println("1. to add a Book");
            System.out.println("2. to remove a Book");
            System.out.println("3. search a Book");
            System.out.println("4. Number of books");
//            System.out.println("5. to update age");
            System.out.println("6. display all books");
//            System.out.println("7. show By Id");
            System.out.println("8. Exit");
            int choice = userInput.inputNumber();
            switch (choice) {
                case 1: {
                    bookCatalog.addBook();
                    break;
                }
                case 2: {
//                    System.out.println("Enter Id of the Artist");
//                    int artistId = userInput.inputNumber();
                    bookCatalog.deleteBook();
                    break;
                }
                case 3: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
                    bookCatalog.searchBook();
                    break;
                }
                case 4: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
                    bookCatalog.getNumberOfBooks();
                    break;
                }
//                case 5: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
//                    bookCatalog.updateAge(artistId);
//                    break;
//                }
                case 6: {
                    System.out.println("Show all Books");
                    bookCatalog.printAllBooks();
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
