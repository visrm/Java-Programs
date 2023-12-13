import java.util.*;
class array
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the size");
int size=obj.nextInt();
int i,sum=0;
int a[]=new int[size];
System.out.println("enter array elements");
for(i=0;i<size;i++)
{
a[i]=obj.nextInt();
sum=sum+a[i];
}
System.out.println("Sum=" +sum);
}
}
