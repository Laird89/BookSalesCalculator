//Laird,Chris
//1229_4026; October 22,2022
/*Description: A program that reads pairs of inputs for “bookId” and “quantity sold” 
and calculates total sale value of each book, then the program finally calculates accumulative 
total of all books sold during a business day*/
import java.util.Scanner;

public class BookSellerAccounting{
	public static void main(String [] args){
		Scanner input= new Scanner(System.in);
		
		//declaring the variables used in the program
		int bookId;
		int quantitySold;
		final double b1price = 20.85;
		final double b2price = 14.50;
		final double b3price = 19.30;
		final double b4price = 41.25;
		final double b5price = 61.65;
		double totalCost=0.0;
		
		//prompt user to select book between 1 and 5 and 0 will stop
		System.out.print("Enter bookId (1-5 or 0 to stop):");
		bookId = input.nextInt();
		
		//starting the loop of inputting book ids and if the sentinel value 0 is entered the loop will end and the final print line will be executed
		while (bookId != 0){
			
			//switch statement, each case is for the bookId the user inputs
			switch (bookId){
				case 1 : 		
				System.out.print("Enter book quantity sold:");
				quantitySold = input.nextInt();
				totalCost += b1price * quantitySold;
				break;
				
				case 2 : 
				System.out.print("Enter book quantity sold:");
				quantitySold = input.nextInt();
				totalCost += b2price * quantitySold;
				break;
				
				case 3 : 
				System.out.print("Enter book quantity sold:");
				quantitySold = input.nextInt();
				totalCost += b3price * quantitySold;
				break;
				
				case 4 : 
				System.out.print("Enter book quantity sold:");
				quantitySold = input.nextInt();
				totalCost += b4price * quantitySold;
				break;
				
				case 5 : 
				System.out.print("Enter book quantity sold:");
				quantitySold = input.nextInt();
				totalCost += b5price * quantitySold;
				break;
				
				default : 
				System.out.println("Book number must be between 1 and 5 or 0 to stop");
			}
			
			//after the case has been executed the user is prompted to add another bookId which will start the loop again
			System.out.print("Enter bookId (1-5 or 0 to stop):");
			bookId = input.nextInt();
			
		}
		
		//final print statement 
		System.out.printf("Total of all books sold for the day is: $%.2f", totalCost);
	}
}