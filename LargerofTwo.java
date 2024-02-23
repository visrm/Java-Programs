import java.util.*;
class LargerofTwo
{
	public static void main(String arg[])
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1= obj.nextInt();
		System.out.println("Enter 2nd number:");
		int num2= obj.nextInt();
		if(num1== num2) System.out.println("Equivalent numbers entered.");
		else if(num1>num2) System.out.println(num1+ " is larger.");
		else System.out.println(num2+" is larger.");
	}
}
