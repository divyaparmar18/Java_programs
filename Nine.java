/**Socho aap ek planet par ho jahan yeh rules hain

5 saal ki umar ke baad school ja sakte ho.
18 saal ki umar ke baad vote de sakte ho.
21 saal ki umar ke baad car drive kar sakte ho.
24 saal ki umar ke baad shaadi kar sakte ho.
25 saal ke baad legally drink kar sakte ho.
Ab ek flowchart banao jo user se uski “age” input le.**/

import java.util.Scanner;

public class Nine

{

	public static void main(String[]args)

{

	Scanner sd = new Scanner(System.in);

	System.out.println("enter a number");

	int age = sd.nextInt();

	if (age > 5)

	{

	System.out.println ("aap school jaa sakte ho ");

	}

	if (age > 18)

	{

	System.out.println ("aap vote de sakte ho");

	}

	if (age > 21)

	{

	System.out.println ("aap car chala sakte ho");
	
	}

	if (age > 24)

	{

	System.out.println ("aap shadi kar sakte ho");

	}

	if (age > 25)

	{

	System.out.println ("aap drink kar sakte ho");

	}

}

}
	  


