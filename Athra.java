/** Write a program using switch case statement in which user will enter numbers from 1 to 7 and according to number day of the week will me printed..**/

import java.util.Scanner;

public class Athra

{

	public static void main(String [] args)

{

	Scanner as = new Scanner(System.in);

	System.out.println("enter a number : ");

	int day = as.nextInt();

	switch (day)

 	{

	case 1:

	System.out.println("sunday");

	break;

	case 2:

	System.out.println("monday");

	break;

	case 3 :

	System.out.println("tuesday");

	break;

	case 4:

	System.out.println("wednesday");

	break;

	case 5:

	System.out.println("thursday");


	break;

	case 6:

	System.out.println("friday");

	break;

	case 7 :

	System.out.println("saturday");

	break;

	default:

 	System.out.println("out of range");

	}



}

}

	

	

