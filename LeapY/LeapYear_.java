import java.util.Scanner;
public class LeapYear_ {
    public static void main(String[] args) {
        int year;
        boolean leap = false;

        Scanner input = new Scanner(System.in);

		//Set input from user
		System.out.println("Please ente a year");
		year = input.nextInt();

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}