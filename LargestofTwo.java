import java.io.*;
import java.util.*;
class LargestofTwo
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=obj.nextInt();
		System.out.println("Enter num2:");
		int num2=obj.nextInt();
		System.out.println("Enter num3:");
		int num3=obj.nextInt();
		if(num1==num2&&num2==num3)
		         System.out.println("numbers entered are of equal values****");
		else if(num1>num2&&num1>num3)
			System.out.println(num1+" is greatest");
		else if(num2>num3)
			System.out.println(num2+" is greatest");
		else
			System.out.println(num3+" is greatest");
	}
}
