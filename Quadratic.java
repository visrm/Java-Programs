import java.io.*;
import java.util.*;
class Quadratic
{
	public static void main(String arg[])
	{	
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter variable a:");
		float a=obj.nextFloat();
		System.out.println("Enter variable b:");
		float b=obj.nextFloat();
		System.out.println("Enter variable c:");
		float c=obj.nextFloat();
		float y=b*b-4.0*a*c;
		int num=0;
		if(y==0.0)
			num=0;
		else if(y>0.0)
			num=1;
		else
			num=2;
		switch(num)
		{
			case 0:System.out.println("x="+-b/(2.0*a));
				break;
			case 1:System.out.println("x1="+(-b+Math.pow(y,0.5))/(2.0*a));
				System.out.println("x2="+(-b-Math.pow(y,0.5))/(2.0*a));
				break;
			case 2:System.out.println("x is imaginary");
				break;
			default:System.out.println("invalid");
		}
	}	
}
