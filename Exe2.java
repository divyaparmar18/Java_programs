//**There is a 10 Story building. You are on ground floor and have to reach on top. You can climb only 1 floor at a time. Write a program using loop which will update like this "Floor number 1 " etc. When you reach on top, it will print "I have reached on top, Hurray"**//

class  Exe2

{

	public static void main(String[]args)

{

	int i = 0;
	while (i <= 10)
    {
	System.out.println("Floor no" + i);
	i ++;

     }
	if (i == 10)
	{
	System.out.println("I have reached on the top ,Hurry!");

     }

   }

}
