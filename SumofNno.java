import java.util.*;
class SumofNno
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a limit:");
		int n=obj.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
			System.out.println("Enter a number:");
			int num=obj.nextInt();
			sum=sum+num;
			i++;
		}
		System.out.println("The sum is "+sum);
	}
}
