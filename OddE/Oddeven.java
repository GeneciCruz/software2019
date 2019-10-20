/*
Author: Geneci Ui Fhatharta
Date:04-10-2019
This application produce:
Input                   Process                 		Output
userNumber				computeOddOrEven				number by state
*/

public class Oddeven{
	//Declare variables
	private int userNumber;
	private String message;

	//Set methods to retrieve values from user side
	public void setUserNumber(int userNumber){
		this.userNumber = userNumber;
	}

	//Compute calculations needed
	public void computeUserNumber(){

		if(userNumber % 2 == 0){
			message = "This is an Even number";
		}
		else {
			message = "This is an Odd number";
		}
	}

	//Get values returned after processed
	public String getUserNumber(){
		return message;
	}

}// end of class