import java.util.Scanner;

public class Chaubis

{

	public static void main(String[]args)

{

	double bonus;

	Scanner af = new Scanner(System.in);

	System.out.println("enter the amount of the salary :");

	double salary = af.nextDouble();

	bonus = 5/100 * salary;

	System.out.println (bonus);

}

}

