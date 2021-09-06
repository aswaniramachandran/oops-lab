import java.util.Scanner;
class Employees
{
	int empid;
	String name,address;
	float salary;
	Employees()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empid :");
		empid=sc.nextInt();
		System.out.println("enter the name:");
	        name=sc.next();
		System.out.println("enter the Address:");
		address=sc.next();
		System.out.println("enter the Salary:");
		salary=sc.nextFloat();
		
	}
	
}
class Teacher extends Employees
{
	String dept,subject;
	Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Dept:");
		dept=sc.next();
		System.out.println("Subject:");
		subject=sc.next();
	}
	void display()
	{
		
		System.out.printf("%5s%10s%10s%10s%10s%10s\n","empid", "name"," address","salary","dept","sub\n");
		System.out.printf("%5d%10s%10s%10.0f%10s%10s\n",empid,name,address,salary,dept,subject);
		
	}
	      public static void main(String args[])
		  {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the no of Employees you want to enter");
		   int n=sc.nextInt();
		   Teacher t[]=new Teacher[n];
		   for (int i=0;i<n;i++)
		    { 
			    t[i]=new Teacher();
		    }
		   for (int i=0;i<n;i++)
		    {
			    t[i].display();
		    }
		
	}
}