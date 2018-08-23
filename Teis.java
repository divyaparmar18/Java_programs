/** take a amount from the user and remove his commission if their salary is below 5000 there will be no commision, if the salary is between 5000 to 10000 then the commision will be 5%, from 10000 to 20000 the commision will be 10% and if the salray is above 20000 to 50000 then the nthe commisssion will be 20%....**/

import java.util.Scanner;

public class Teis

{

	public static void main(String[]args)

{

	double bonus;

	Scanner af = new Scanner(System.in);

	System.out.println("enter the amount of the salary :");

	double salary = af.nextDouble();

	if (salary <= 5000)

	{

	System.out.println("no commission");

	}

        else if (salary > 5000 && salary < 10000)

	{


	 bonus = (5.0/100) * salary;
	
	
	System.out.println("the user will get " + bonus + " rupees commission");

	}

         else if (salary > 10000 && salary < 20000)

	{


	 bonus = (10.0/100) * salary;


	System.out.println("the user will get " + bonus + " rupees commission");

	}

        else if (salary > 20000 && salary < 50000)

	{

	bonus = (20.0/100) * salary;

	
	System.out.println("the user will get " + bonus + " rupees commission");

	}

	else 

	{

	System.out.println("you are the winner ");

	}

}

}

	
