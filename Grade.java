import java.io.*;
import java.util.*;
class Grade
{
	public static void main(String arg[])
	{	
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter mark 1:");
		int m1=obj.nextInt();
		System.out.println("Enter mark 2:");
		int m2=obj.nextInt();
		System.out.println("Enter mark 3:");
		int m3=obj.nextInt();
		float t=(float)m1+m2+m3;
		float pt=(t/300)*100;
		if(pt>=90.0)
		{
			System.out.println("You secured Grade A");
		}
		else if(pt>=80.0)
		{
			System.out.println("You secured Grade B");
		}
		else if(pt>=70.0)
		{
			System.out.println("You secured Grade C");
		}
		else if(pt>=60.0)
		{
			System.out.println("You secured Grade D");
		}
		else if(pt>=50.0)
		{
			System.out.println("You secured Grade E");
		}
		else
		{
			System.out.println("Failed");
		}	
	}
}
