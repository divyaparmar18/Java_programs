/**Hum user se username/password input karvaeynge aur agar woh humare paas stored username password se match karega hum toh hi success message dikhayenge. Jaise:**/

import java.util.Scanner;

public class Satra

{

public static void main(String[]args)

{

	Scanner af = new Scanner(System.in);

	   System.out.print("enter user name : ");

	     String name = af.next();

	       System.out.print("enter password : ");

	          String pass = af.next();

	       String user = "Zoyaa";

	    String word = "hey1234";

	if (name .equals (user))

	  if (pass .equals (word))

	    {

	      System.out.println("log iin");

	    }

       else

      {

    System.out.println("error");


  }
}

}



