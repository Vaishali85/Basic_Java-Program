
import java.util.*;
public class Employee 
{

String name;
 int salary;
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	Employee ob[]=new Employee[5];
	for(int i=0;i<5;i++)
	{
		ob[i]=new Employee();
		System.out.println("enter the Names::");
		ob[i].name=sc.next();
		System.out.println("enter the salary::");
		ob[i].salary=sc.nextInt();
		
		
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<i;j++)
		{
		if(ob[i].salary>ob[j].salary)	
		{
			Employee temp=ob[i];
			ob[i]=ob[j];
			ob[j]=temp;
		}
		
		}
		
		
	}
	for(int i=0;i<5;i++)
	{
	System.out.println("Display details::"+ob[i].name+"\t"+ob[i].salary);
	
	
	}
	
}
}
/*
enter the Names::
rushi
enter the salary::
12121
enter the Names::
somya
enter the salary::
12312
enter the Names::
sunny
enter the salary::
12456
enter the Names::
komal
enter the salary::
000001
enter the Names::
manvi
enter the salary::
10
Display details::sunny	12456
Display details::somya	12312
Display details::rushi	12121
Display details::manvi	10
Display details::komal	1
*/