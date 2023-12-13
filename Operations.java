import java.io.*;
class Test
{
	int a=5;
	int b=4;
	
	void check()
	{
		int c=a+b;
		System.out.println(c);
	}
	void diff()
	{
		int c=a-b;
		System.out.println(c);
	}
}
class Test2
{
	int a=7;
	int b=9;
	
	void print()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
class Operations
{
	public static void main(String args[])
	{
		Test obj1=new Test();
		obj1.check();
		Test2 obj2=new Test2();
		obj2.print();		
	}
}
