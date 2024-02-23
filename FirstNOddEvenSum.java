import java.util.*;
class FirstNOddEvenSum
 {
   public static void main(String args[]) {
	  Scanner obj= new Scanner(System.in);
	  System.out.println("Enter the Nth number:");
	  int n= obj.nextInt();
	  int i, evensum= 0, oddsum= 0;
	  for(i=1;i<=n;i++) {
	    if(i%2==0) evensum += i;
	    else oddsum += i;
	   }
	  System.out.println("The sum of even numbers in first " +n+" terms is: "+evensum);
	  System.out.println("The sum of odd numbers in first " +n+" terms is: "+oddsum);
    }
 }
