/**Aapke paas ek variable hai, jisme yeh value hai:

varx = 300 - 123, user se ek number input le ke check kare ki woh number varx ke barabar hai ya nahi.

Agar barabar hai toh print karo barabar hai nahi toh print karo barabar nahi hai.**/

import java.util.Scanner;

public class Var

{

	public static void main(String [ ] args)
	
{

	System.out.println("enter a number");

	Scanner a = new Scanner(System.in);

	int var = a.nextInt();

	int num = 300;

	int num1 = 123;

	int varx = num - num1;

	if(var == varx)

	{

	System.out.print("barabar hai");

	}

	else

	{

	System.out.print("barabar nahi hai");
}

}

}


