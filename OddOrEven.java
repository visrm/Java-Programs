import java.util.*;
class OddOrEven {
   public static void main(String arg[])
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= obj.nextInt();
		if(num==0) System.out.println(num+" is zero");
		else
		{
  		  if(num%2==0) System.out.println(num+" is an Even number");
		  else System.out.println(num+" is an Odd number");
		}
	}
}
