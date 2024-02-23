import java.util.*;
class LargestOfThree
{
  public static void main(String arg[])
   {	
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter 1st number :");
	int n1= obj.nextInt( );
	System.out.println("Enter 2nd number :");
	int n2= obj.nextInt( );
	System.out.println("Enter 3rd number :");
	int n3= obj.nextInt( );
	if(n1== n2 && n2== n3)  System.out.println("Equivalent numbers");
	else
	{
		if(n1>n2)
		{
		   if(n1>n3) System.out.println(n1+" is greatest");
		   else  System.out.println(n3+" is greatest");
		}
		else
		{
			if(n2>n3)  System.out.println(n2+" is greatest");
			else  System.out.println(n3+" is greatest");	
		}
	}
   }
}
