/*
Author: Geneci Ui Fhatharta
Date:15-10-2019
This application produce:
Input                   Process                 Output
userAge					rangeOfAge				message
*/
//Import classes needed
import java.util.Scanner;
public class OddevenApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		int userNumber;
		String message;

		//Create and define objects
		Oddeven o = new Oddeven();
		Scanner userInput = new Scanner(System.in);

		//Set input from user
		System.out.println("Please enter your number");
		userNumber = userInput.nextInt();

		//Set input back to instatiable class
		o.setUserNumber(userNumber);

		//Call method to process calculation
		o.computeUserNumber();

		//Get values returned
		message = o.getUserNumber();

		//Output results
		System.out.println(message);

	}//end main method
}//end class App