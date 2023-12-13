import java.util.*;
class Naturalno
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a limit");
		int n=obj.nextInt();
		int i=1;
		System.out.println("The Natural numbers till "+n+":");
		while(i<=n)
		{
			System.out.print(i+", ");
			i++;
		}
		System.out.println("");
	}
}

