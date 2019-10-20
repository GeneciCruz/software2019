/*
Author: Geneci Ui Fhatharta
Date:04-10-2019
This application produce:
Input                   Process                 Output
userAge					rangeOfAge				message
*/
//Import classes needed
import java.util.Scanner;
public class     AgesApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		int userAge;
		String message;

		//Create and define objects
		Ages a = new Ages();
		Scanner userInput = new Scanner(System.in);

		//Set input from user
		System.out.println("Please enter your age");
		userAge = userInput.nextInt();

		//Set input back to instatiable class
		a.setUserAge(userAge);

		//Call method to process calculation
		a.computeUserAge();

		//Get values returned
		message = a.getUserAge();

		//Output results
		System.out.println(message);

	}//end main method
}//end class App