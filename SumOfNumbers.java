import java.util.*;
class SumOfNumbers {
     public static void main(String args[])
        {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the limit of numbers:");
		int n = obj.nextInt();
		int i = 0,sum = 0;
		while(i<n)
		{
	 	   System.out.println("Enter a number:");
		   int num = obj.nextInt();
		   sum += num;
		   i++;
		}
		System.out.println("The sum of numbers is "+sum);
       }
}
