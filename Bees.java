/** write the wiceversa of older file**/

import java.util.Scanner;

public class Bees

{

	public static void main(String[]args)

{

	Scanner af = new Scanner(System.in);

	System.out.println("enter a week day : ");

	String week = af.next();

	switch (week)

	{

	case "sunday":

	System.out.println(1);

	break;

	case "monday":

	System.out.println(2);

	break;

	case "tuesday":

	System.out.println(3);

	break;

	case "wednesday":

	System.out.println(4);

	break;

	case "thursday":

	System.out.println(5);

	break;

	case "friday":

	System.out.println(6);

	break;

	case "saturday":

	System.out.print(7);

	break;

	default :

	System.out.println("out of range");

	}

}

}
