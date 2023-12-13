import java.io.*;
import java.util.*;
class fibanocci
{
 public  static void main(String args[])
 {
 Scanner obj=new Scanner(System.in);
 System.out.println("enter the limit");
 int n=obj.nextInt();
 int i,c;
 int a=0;
 int b=1;
 System.out.println(a);
 System.out.println(b);
 for(i=3;i<=n;i++)
 {
 c=a+b;
 a=b;
 b=c;
  System.out.println(c);
  }
  }
  }
