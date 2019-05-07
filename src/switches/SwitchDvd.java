package switches;

import java.util.Scanner;

import modelsManagement.DvdCatalog;

public class SwitchDvd {
	
    public static Scanner sc = new Scanner(System.in);
    UserInput userInput = new UserInput();
    
    public void menu() throws Exception {
    	DvdCatalog dvdCatalog = new DvdCatalog();
        boolean option = true;
        do {
            System.out.println("Please Enter your Choice");
            System.out.println("1. to add a Dvd");
            System.out.println("2. to remove a Dvd");
            System.out.println("3. to search a Dvd");
            System.out.println("4. Number of Dvd's");
//            System.out.println("5. to update age");
            System.out.println("6. display all dvd's");
//            System.out.println("7. show By Id");
            System.out.println("8. Exit");
            int choice = userInput.inputNumber();
            switch (choice) {
                case 1: {
                    dvdCatalog.addDvd();
                    break;
                }
                case 2: {
//                    System.out.println("Enter Id of the Artist");
//                    int artistId = userInput.inputNumber();
                    dvdCatalog.deleteDvd();
                    break;
                }
                case 3: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
                	  dvdCatalog.searchDvd();
                    break;
                }
                case 4: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
                      dvdCatalog.getNumberOfDvds();
                    break;
                }
//                case 5: {
//                    System.out.println("Enter Id of the artist");
//                    int artistId = userInput.inputNumber();
//                    bookCatalog.updateAge(artistId);
//                    break;
//                }
                case 6: {
                    System.out.println("Show all Dvds");
                    dvdCatalog.printAllDvds();
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
