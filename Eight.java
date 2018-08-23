/** user se ek number input le aur yeh check kare ki kya number 5 aur 15 dono se divisible hai?**/

import java.util.Scanner;

public class Eight

{

	public static void main(String[]args)

{

	Scanner ag = new Scanner(System.in);

	System.out.println("enter a number");

	int number = ag.nextInt();

	if (number % 5 == 0 && number % 15 == 0)

	{

	System.out.println ("divisible hai");

	}

	else

	{

	System.out.println ("divisible nahi hai");

	}

}


}
