/*
Author: Geneci Ui Fhatharta
Date:15-10-2019
This application produce:
Input                   Process                 Output
monthsNumber			condition for days		days in each month
*/
//Import classes needed
import java.util.Scanner;
public class  MonthsApp{
	//Declare main method
	public static void main (String args[]){
		//Declare variables
		int months;
		String message;
		String month;

		//Create and define objects
		Months m = new Months();
		Scanner input = new Scanner(System.in);

		//Set input from user
		System.out.println("Please choose a month number");
		months = input.nextInt();

		//Set input back to instatiable class
		m.setMonths(months);

		//Call method to process calculation
		m.computeMonthsDays();

		//Get values returned
		message = m.getMonthsDays();
		month = m.getMonthsName();

		//Output results
		System.out.println(month + " --> " + message);

	}//end main method
}//end class App