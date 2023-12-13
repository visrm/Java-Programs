import java.io.*;
import java.util.*;
class pattern
{
 public  static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter the limit");
 int n=obj.nextInt();
 int i,j;
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=i;j++)
 {
 System.out.print("*");
 }
 System.out.print("\n");
 }
 }
 }
