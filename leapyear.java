import java.io.*;
import java.util.*;
class leapyear
{
	public static void main(String arg[])
	{	
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=obj.nextInt();
		if(year%100==0)
		{
			if(year%400==0)
				System.out.println(year+" is a leap year");
			else
				System.out.println(year+" is not a leap year");
		}
		else
		{
			if(year%4==0)
				System.out.println(year+" is a leap year");
			else
				System.out.println(year+" is not a leap year");	
		}
	}
}
