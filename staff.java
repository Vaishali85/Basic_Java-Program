import java.util.*;
public class Staff 
{
	String name,designation;
	 int b_date,salary;

staff(String name,String designation,int b_date,int salary)
{
	this.name=name;
	this.designation=designation;
	this.b_date=b_date;
	this.salary=salary;	
}
void display()
{
	System.out.println("name::"+name);
	System.out.println("designation::"+designation);
	System.out.println("b_date::"+b_date);
	System.out.println("salary::"+salary);
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the limit::");
	int n=sc.nextInt();
	staff ob[]=new staff[n];
	
	for(int i=0;i<n;i++)
	{
	 
			
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the designation:");
		String designation=sc.next();
		System.out.println("enter the b_date:");
		int b_date=sc.nextInt();
		System.out.println("enter the salary:");
		int salary=sc.nextInt();	
		ob[i]=new staff(name,designation,b_date,salary);
	 
	}
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
			if(ob[i].salary<ob[j].salary)	
			{
				staff temp=ob[i];
				ob[i]=ob[j];
				ob[j]=temp;
			}
			
			}
		
		
	}
		for(int i=0;i<n;i++)
		{
			ob[i].display();
		}
}
}
/*
enter the limit::

2
enter the name:
rushi
enter the designation:
student
enter the b_date:
12
enter the salary:
50000
enter the name:
somnath
enter the designation:
student
enter the b_date:
8
enter the salary:
35999
name::somnath
designation::student
b_date::8
salary::35999
name::rushi
designation::student
b_date::12
salary::50000
*/