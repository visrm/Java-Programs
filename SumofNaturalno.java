import java.util.*;
class SumofNaturalno
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a limit");
		int n=obj.nextInt();
		int i=1,sum=0;
		while(i<=n)
		{
			sum=sum+i;
			System.out.print("+"+i);
			i++;
		}
		System.out.print("="+sum);
	}
}

