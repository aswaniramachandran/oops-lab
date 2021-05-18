import java.util.Scanner;
class employee {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		 int flag=0,n,x,i;
		Scanner sc=new Scanner(System.in);
		employee[] emp=new employee[50];
		System.out.println("Enter the no of employees");
		 n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter Employee No:");
			emp[i]=new employee();
			emp[i].eno=sc.nextInt();
			System.out.println("Enter Employee Salary:");
			emp[i].esalary=sc.nextInt();
			System.out.println("Enter Employee Name:");
		    emp[i].ename=sc.next();
		}
		System.out.println("Enter the employee id you want to find :");
		 x=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(emp[i].eno==x)
			{
				 flag = 1;
                break;
			}
			 else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
				System.out.println("Employee found at postion"  + (i + 1));
        }
        else
        {
            System.out.println("employee not found");
        }
    }
}
output

C:\Users\diljith\Desktop\java>javac employee.java
C:\Users\diljith\Desktop\java>java employee
Enter the no of employees
3
Enter Employee No:
1
Enter Employee Salary:
15000
Enter Employee Name:
anoop
Enter Employee No:
2
Enter Employee Salary:
30000
Enter Employee Name:
subin
Enter Employee No:
3
Enter Employee Salary:
55000
Enter Employee Name:
subish
Enter the employee id you want to find :
3
Employee found at postion 3        