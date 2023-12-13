import java.util.*;
class oddeven
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter a number");
int n=obj.nextInt();
int i=1,evensum=0,oddsum=0;
while(i<=n)
{
if(i%2==0)
{
evensum=evensum+i;
}
else
{
oddsum=oddsum+i;
}
i++;
}
System.out.println("evensum");
System.out.println("oddsum");
}
}
