/*
Author: Geneci Ui Fhatharta
Date:15-10-2019
This application produce:
Input                   Process                 		Output
personAge				costOfTickets					computeCostOfTicket	by age
*/

public class Tickets{
	//Declare variables
	private int personAge;
	private String costOfTicket;

	//Set methods to retrieve values from user side
	public void setPersonAge(int personAge){
		this.personAge = personAge;
	}

	//Compute calculations needed
	public void computeCostOfTickets(){
		if(personAge >= 5 && personAge <= 14){
			costOfTicket = "Ticket cost is 5.50 euro";
		}
		else if(personAge >= 15 && personAge <= 65){
			costOfTicket = "Ticket cost is 10.90 euro";
		}
		else{
			costOfTicket = "Ticket is Free";
		}
	}

	//Get values returned after processed
	public String getTicketCost(){
		return costOfTicket;
	}

}// end of class