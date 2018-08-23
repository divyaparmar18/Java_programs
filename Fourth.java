/**Agar water filter mein paani 1L se kam hai to aur paani bharna hai. Agar paani 1L se 10L ke beech mein hai to aur nahi bharna. Aur agar 10L se jyada hai to paani overflow kar jata hai. Neeche diye flowchart ko iss information ka use karke complete karo.

Paani ke level ke liye aap user se ek water naam ke variable mein input lo, aur fir usko integer mein convert kar lo.*/

import java.util.Scanner;

public class Fourth

{

	public static void main(String[]args)

{ 

	System.out.println("enter number of liters of water");

        Scanner a = new Scanner(System.in);

        int num1 = a.nextInt();

	if (num1 < 1)

	{

	System.out.print ("pani bharna hai");

	}

	else if (num1 > 1 && num1 < 10)

	{

	System.out.print ("nahi bharna aur");

	}

	else if (num1 > 10)

	{

	System.out.print ("overflow ho gaya");

	}

}


}

	 

	 

	
