import java.util.*;
class FirstNOddorEven 
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a limit:");
		int n= obj.nextInt();
		int i= 1,even_count= 0,odd_count= 0;
		while(i<= n)
		{
			if(i%2== 0)
				even_count += i;
			else
				odd_count += i;
			i++;
		}
		System.out.println("The sum of even numbers is "+even_count);
		System.out.println("The sum of odd numbers is "+oddcount);
	}
}
