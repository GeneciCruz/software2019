/*
Author: Geneci Ui Fhatharta
Date:16-10-2019
This application produce:
Input                   Process                 Output
userYear				isLeapYear				"This is a leap year" or "That is not a leap year"
*/

//Import classes needed
import java.util.Scanner;
public class  LeapApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		 int userYear;
		 String outputMsg;
		 int leapYear;

		//Create and define objects
		Leap l = new Leap();
		Scanner input = new Scanner(System.in);

		//Set input from user
		System.out.println("Please ente a year");
		userYear = input.nextInt();

		//Set input back to instatiable class
		l.setUserYear(userYear);

		//Call method to process calculation
		l.computeLeapYear();

		//Get values returned
		outputMsg = l.getLeapYear();

		//Output results
		System.out.println(outputMsg);

	}//end main method
}//end class App