/**, ek variable mein string daal diya hai. Ab user se woh string guess karvana hai. Iska code aise likhenge:**/

import java.util.Scanner;

public class Sola

{

	public static void main(String[]args)

{

	Scanner a = new Scanner(System.in);

	System.out.print("guess the place: ");

        String  place = a.next();

	String value = "Delhi";

	if (place .equals(value))

	{

	System.out.println("sahi gues  kiya");

	}

	else

	{

        System.out.println("sahi guess nahi kiya");

	}

}

}

	

	 
