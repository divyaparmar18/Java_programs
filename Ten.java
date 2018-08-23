/**Ek number naam ke variable mein ek variable input lo aur usko integer mein type cast kar lo.

Agar yeh number 10 se chota hai tab print karo “10 se chota hai”. Agar wo 10 se bada hai aur 20 se chota hai tab print karo “20 se chota hai”. Aur agar 20 se bada hai tab print karo ki “20 se bada hai”.*/

import java.util.Scanner;

 class Ten

{

	public static void main(String[] args){
	
	System.out.println ("enter a number");
     
 	Scanner s = new Scanner (System.in);

	int number = s.nextInt();

	if (number <= 10)

	{

	System.out.print("10 se chota hai");

	}

	else if( number >= 10 && number <= 20)
	{

	System.out.print("20 se chota hai");

	}

	else if ( number >= 20)

	{

	System.out.print ("20 se bada hai");

	}

   }


}



      

	 
