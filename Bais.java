/** find the area of the circle with radis given by the user**/

import java.util.Scanner;

public class Bais

{

	public static void main(String[]rgs)

{

	Scanner as = new Scanner(System.in);

	System.out.println ("enter a radius of a circle");

	double radius = as.nextDouble();

	double area =  3.14 * radius * radius;

	System.out.println(" the area of the circle is " + area + " sq");

}


}  
