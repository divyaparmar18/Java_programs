/** declare vowel oe consonant**/

import java.util.Scanner;

public class Unnis

{

	public static void main (String[]args)

{

	Scanner fc = new Scanner(System.in);

	System.out.println("enter a alphabet in capital letter : ");

	String letter = fc.next();

	switch (letter)

{

	case "A":

	System.out.println("it's a vowel");

	break;

	case "E":

	System.out.println("it's a vowel");

	break;

	case "I":

	System.out.println("it's a vovel");

	break;

	case "O":

	System.out.println("it's a vowel");

	break;

	case "U":

	System.out.println("it's a vowel");

	break;

	default :

	System.out.println("it's a consonant");

	}

}

}

