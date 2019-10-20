/*
Author: Geneci Ui Fhatharta
Date:04-10-2019
This application produce:
Input                   Process                 	Output
userAge					ticketCost	by userAge		ticketCost @ 10%up and 10% down
*/
//Import classes needed
import java.util.Scanner;
public class  CinemaApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		 int userAge;
		 double ticketCost;
		 double percentRate;
	 	 int day;

		//Create and define objects
		Cinema c = new Cinema();
		Scanner input = new Scanner(System.in);

		//Set input from user T12o send to Cinema class
		System.out.println("Please enter your age");
		userAge = input.nextInt();
		System.out.println("Please enter  1 for Weekday and 2 for Weekend");
		day = input.nextInt();

		//Set input back to instatiable class
		c.setUserAge(userAge);
		c.setDay(day);

		//Call method to process calculation
		c.calculateTicketCost();

		//Get values returned
		ticketCost = c.getTicketCost();

		//Output results
		System.out.println("TicketCost " + ticketCost);

	}//end main method
}//end class App