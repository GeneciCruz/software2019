/*
Author: Geneci Ui Fhatharta
Date:16-10-2019
This application produce:
Input                   Process                 Output
userYear				isLeapYear				"This is a leap year" or "That is not a leap year"
*/
public class Leap{
	//Declare variables
	private int userYear;
	private String outputMsg;
	private boolean isLeapYear = false;

	//Set methods to retrieve values from user side
	public void setUserYear(int userYear){
		this.userYear = userYear;
	}

	//Compute calculations needed
	public void computeLeapYear(){
		if(userYear % 4 == 0 ){  //this checks if year divisble by 4

			isLeapYear = true;

			if(userYear % 100 == 0 ){ // this checks if year is centure year

				isLeapYear = false;

				if(userYear % 400 == 0){

					isLeapYear = true;
				}

			}

				outputMsg = "This is a Leap Year";
		}
		else{

			isLeapYear = false;
			outputMsg = "This is not a Leap Year";
		}

	}

	//Get values returned after processed
	public String getLeapYear(){
		return outputMsg;
	}

}// end of class


















































