/**User se ek varx naam ka variable input lo.
Usko integer mein convert karo.
Check karo ki yeh number 2 se divisible hai ya nahi.**/

import java.util.Scanner;

public class Fifth

{

	public static void main(String[] args)

{

	System.out.println("enter a number");

	Scanner d = new Scanner(System.in);

	int varx = d.nextInt();

	if (varx % 2 == 0)

	{

	System.out.print("divisible hai");

	}

	else

	{

	System.out.print("divisible nhi hai");

	}


}

}

