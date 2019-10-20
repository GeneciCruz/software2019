/*
Author: Geneci Ui Fhatharta
Date:15-10-2019
This application produce:
Input                   Process                 Output
userAge					rangeOfAge				message
*/
//Import classes needed
import java.util.Scanner;
public class TicketsApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		int personAge;
		String costOfTicket;

		//Create and define objects
		Tickets t = new Tickets();
		Scanner userInput = new Scanner(System.in);

		//Set input from user
		System.out.println("Please enter your age");
		personAge = userInput.nextInt();

		//Set input back to instatiable class
		t.setPersonAge(personAge);

		//Call method to process calculation
		t.computeCostOfTickets();

		//Get values returned
		costOfTicket = t.getTicketCost();

		//Output results
		System.out.println(costOfTicket);

	}//end main method
}//end class App