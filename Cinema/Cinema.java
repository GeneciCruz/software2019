/*
Author: Geneci Ui Fhatharta
Date:16-10-2019
This application produce:
Input                   Process                 	Output
userAge					ticketCost	by userAge		ticketCost @ 10%up and 10% down
*/

public class Cinema{
	//Declare variables
	private int userAge;
	private double ticketCost;
	private double percentRate = 0.1;
	private int day;

	//Set methods to retrieve values from user side
	public void setUserAge(int userAge){
		this.userAge = userAge;
	}

	public void setDay (int day){
		this.day = day;
	}
	//compute ticket cost
	public void calculateTicketCost(){

		if(userAge >=5 && userAge <= 14){

			if(day == 1){

				ticketCost = 5.50 - (5.50 * percentRate);

			}
			else if (day == 2) {

				ticketCost = 5.50 + (5.50 * percentRate);

			}
			else{

			System.out.println ("This is a invalid day");
			}
		}
		else if(userAge >=15 && userAge <= 65){

			if(day == 1){

				ticketCost = 10.90 - (10.90 * percentRate);

			}
			else if (day == 2) {

				ticketCost = 10.90 + (10.90 * percentRate);

			}
			else{

			System.out.println ("This is a invalid day");
			}
		}
		else{
				ticketCost = 0.0;
		}
	}


	//Get values returned after processed
	public double getTicketCost(){
		return ticketCost;
	}

}//