import java.util.*;
class Grade
{
	static void compute(float t, int sub, int max) {
	   int total= sub*max;
   	float pt=(t/total)*100;
		if(pt>=90.0) System.out.println("You secured A Grade");
		else if(pt>=80.0) System.out.println("You secured B Grade");
		else if(pt>=70.0) System.out.println("You secured C Grade");
		else if(pt>=60.0) System.out.println("You secured D Grade");
		else if(pt>=50.0) System.out.println("You secured E Grade");
		else System.out.println("You've Failed");	
   }
	public static void main(String arg[]) {	
	    int[] m = new int[10];
	    int i= 0;
	    float t= 0;
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter Number of subjects: ");
		int sub = obj.nextInt();
		System.out.println("Enter Maximum attainable marks: ");
		int max = obj.nextInt();
		
		while(i<sub)
		{
			System.out.println("Enter mark"+(i+1)+": ");
		    m[i] = obj.nextInt();
		    if(m[i]>max) 
		    { 
		      System.out.println("Marks exceeds maximum limit.");
		      break;
		    }
		   else t = (float)t +m[i];
			i++;
		}
		if(i==sub) compute(t, sub, max);
	}
}