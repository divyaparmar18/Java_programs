/**Q No. 6--> Write a program which prints firt 100 numbers of a fabonicci series like 0, 1, 1, 2, 3, 5, 8, 13, 21, 34..**/

class Exe6

{

	public static void main(String[]args){
	int a = 0, b = 1, c = a + b;

	   System.out.println(a);
	   System.out.println(b);
	
	         for(int i = 0; c < 100; i++){
			System.out.println(c);
			c = a + b;
			a = b;
			b = c;

	}


	
}


}

 
        
