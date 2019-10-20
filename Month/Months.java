/*
Author: Geneci Ui Fhatharta
Date:15-10-2019
This application produce:
Input                   Process                 Output
monthsNumber			condition for days		days in each month

*/

public class Months{
	//Declare variables
	private int months;
	private String message;
	private String month;

	//Set methods to retrieve values from user side
	public void setMonths(int months){
		this.months = months;
	}

	//Compute calculations needed
	public void computeMonthsDays(){
		if (months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12){
			message = "This month has 31 days";
		}
		else if (months == 2){
				message = "This month has 28 or 29 days";
		}
		else if (months == 4 || months == 6 || months == 9 || months == 11){
				message = "This month has 30 days";
		}
		else{
			message = "Invalid month entered";
		}

		switch(months){
			case 1:
			month =  "January";
			break;

			case 2:
			month =  "February";
			break;

			case 3:
			month =  "March";
			break;

			case 4:
			month =  "April";
			break;

			case 5:
			month =  "May";
			break;

			case 6:
			month =  "June";
			break;

			case 7:
			month =  "July";
			break;

			case 8:
			month =  "August";
			break;

			case 9:
			month =  "September";
			break;

			case 10:
			month =  "October";
			break;

			case 11:
			month =  "November";
			break;

			case 12:
			month = "December";
			break;

			default:
			month = "Invalid month";
			break;
		}
	}

	//Get values returned after processed
	public String getMonthsDays(){
		return message;
	}

	public String getMonthsName(){
			return month;
	}

}// end of class