/**Aapke paas ek variable hai, jisme yeh value hai:

number = 44 * 30
Ek flowchart banao jo user se ek alag number input le aur dekhe ki user ne jo number daala hai, woh number variable ke number is bada hai ya barabar hai.

Agar bada ya barabar hai toh print karo ki number, bada ya barabar hai nahi toh print karo chota hai.**/

import java.util.Scanner;

public class Third

{

	public static void main(String [] args)

{

	System.out.println("enter a number");

	Scanner s = new Scanner(System.in);

	int num = s.nextInt();

	int a = 44 * 30;

	if(num >= a)

        {

 	System.out.print("Bada yaa barabar hai");

        }

	else

       {

	System.out.print("chota hai");

       }

}

}
