/** Write a program which will sum all the numbers from 30 to 80 which are divisible by 3?**/

public class Exe9
{
	public static void main(String[]args)
	{
		int i = 30, j = 0;
		for(i = 30; j < 80;i++)
		{
			j = j + i;
			if(i % 3 == 0)
			
				System.out.println(j);
			
		}
	}
}
