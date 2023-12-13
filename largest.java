import java.io.*;
import java.util.*;
class largest
{
 public  static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the 1st number");
 int a=obj.nextInt();
  System.out.println("Enter the 2nd number");
 int b=obj.nextInt();
  System.out.println("Enter the 3rd number");
 int c=obj.nextInt();
 if(a>b)
 {
 if(a>c)
 {
 System.out.println("a is largest");
 }
else
{
 System.out.println("c is largest");
 }
 }
 else
 {
 if(b>c)
 {
  System.out.println("b is largest");
  }
  else
  {
   System.out.println("c is largest");
   }
   }
   }
   }
