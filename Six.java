/**Use se do numbers varx aur vary naam ke variables mein input lo.
Fir yeh check karo ki kya varx vary se divisble hai ya nahi.**/

import java.util.Scanner;

public class Six

{

	public static void main(String[]args)

{

	Scanner as = new Scanner(System.in);

	System.out.println("enter a number");

	int varx = as.nextInt();

	System.out.println("enter another number");

	int vary = as.nextInt();

	if (varx % vary == 0)

	{

	System.out.print("divisible hai");

	}

	else

	{

	System.out.print("divisible nahi hai");

	}


}


}



