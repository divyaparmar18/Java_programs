import java.util.*;
class Year
{
	public static void main(String args[]){

	int num;
	int year_q; int year_r;
	int month_q; int month_r;
	int week_q; int week_r;
	int days;
	Scanner s = new Scanner(System.in);
	System.out.println("enter a number");
	num = s.nextInt();
	year_q = num / 365;
	year_r = num % 365;
	month_q = year_r / 30;
	month_r = year_r % 30;
	week_q = month_r / 7;
	week_r = month_r % 7;
	days = week_r;
	System.out.println("The number entered by the user has " + year_q + " years " + month_q + " months " + week_q + " weeks " + days + " days ");

}

}
