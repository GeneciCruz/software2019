/*
Author: Geneci Ui Fhatharta
Date:04-10-2019
This application produce:
Input                   Process                 Output
userAge					rangeOfAge				message
*/

public class Ages{
	//Declare variables
	private int userAge;
	private String message;

	//Set methods to retrieve values from user side
	public void setUserAge(int userAge){
		this.userAge = userAge;
	}

	//Compute calculations needed
	public void computeUserAge(){
		if(userAge >= 18 && userAge <= 34){
			message = "Welcome, 5 euro entry";
		}
		else if(userAge >= 35 && userAge <= 70){
			message = "Welcome, free entry";
		}
		else{
			message = "Not welcome";
		}
	}

	//Get values returned after processed
	public String getUserAge(){
		return message;
	}

}// end of class