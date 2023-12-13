import java.io.*;
import java.util.*;
class Odd
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=obj.nextInt();
		if(num==0)
			System.out.println(num+" is leo");
		else
		{
			if(num%2==0)
				System.out.println(num+" is an even num");	
			else
				System.out.println(num+" is an odd num");
		}
	}
}  
