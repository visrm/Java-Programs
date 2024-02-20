import java.util.*;
class FirstNOddorEven 
{
	public static void main(String args[])
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter a limit:");
		int n= obj.nextInt();
		int i= 1,evensum= 0,oddsum= 0;
		while(i<= n)
		{
			if(i%2== 0)
				evensum += i;
			else
				oddsum += i;
			i++;
		}
		System.out.println("The sum of even numbers is "+evensum);
		System.out.println("The sum of odd numbers is "+oddsum);
	}
}
