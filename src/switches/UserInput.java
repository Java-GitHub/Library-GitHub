package switches;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	
    static Scanner input = new Scanner(System.in);
    
    public String getfName() {
        System.out.println("Enter first name:");
        return inputString();
    }
    public String getlName() {
        System.out.println("Enter last name:");
        return inputString();
    }
    public int getAge()
    {
        System.out.println("Enter age:");
        return inputNumber();
    }
    public int getId()
    {
        System.out.println("Enter ID:");
        return inputNumber();
    }
    public String inputString()
    {
        return input.nextLine();
    }
    public int inputNumber()
    {
        try
        {
        int number = input.nextInt();
        input.nextLine();
        return number;
        }catch (InputMismatchException exception)
        {
            System.out.println("Enter a valid number");
            input.nextLine();
        return inputNumber();            
        }
    }   
	

}
