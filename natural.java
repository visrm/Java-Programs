import java.util.*;
class natural
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter a number");
int n=obj.nextInt();
int sum=0,i=1;
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println("Sum=" +sum);
}
}
