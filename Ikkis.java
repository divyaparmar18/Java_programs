/** Take a input from a user in seconds  and calculate the hours,minutes and seconds ,**/

/* hour = 60 * 120 = 3600 sec **/

import java.util.Scanner;

public class Ikkis

{
	public static void main(String[]args)
	{
		Scanner sd = new Scanner(System.in);

		System.out.println("enter a time in seconds : ");
	
		int time = sd.nextInt();

	int hour_q = time / 3600;

	int hour_r = time % 3600;

	int minute_q = hour_r / 60;

	int minute_r = hour_r % 60;

	int second = minute_r;

	System.out.println ("The numbers entered by the user has "+ hour_q + " hours " + minute_q + " minutes " + second + " seconds " );


}

}  

	



	


