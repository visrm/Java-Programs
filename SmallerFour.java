import java.io.*;
import java.util.*;
class SmallerFour
{
	public static void main(String arg[])
	{	
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1=obj.nextInt();
		System.out.println("Enter number 2:");
		int n2=obj.nextInt();
		System.out.println("Enter number 3:");
		int n3=obj.nextInt();
		System.out.println("Enter number 4:");
		int n4=obj.nextInt();
		int t1,t2;
		if(n1<n2)
			t1=n1;
		else
			t1=n2;
		if(n3<n4)
			t2=n3;
		else
			t2=n4;
		if(t1<t2)
			System.out.println("Smallest is "+t1);
		else
			System.out.println("Smallest is "+t2);
	}
}
