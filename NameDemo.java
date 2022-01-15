
import java.util.*;
public class NameDemo
{
public static void main(String[] args) 
{
	int i,flag=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("names");
	
		 
		 
		for( i=0;i<args.length;i++) 
		{
			System.out.println(args[i]);
		}         
		
		System.out.println("name to search==");

		
			String s1=sc.next();
			
			for( i=0;i<args.length;i++) 
			{
				if(s1.equals(args[i]))
				{
			flag=1;
			break;
			}         
		}
	
	if(flag==1)
	{
		System.out.println("name found"+args[i]);

		
	}
	else
	{
		
		System.out.println("name not  found");

	}
}	
	
}	
/*
names
rishi
somya
sunny
name to search==
rishi
name foundrishi
*/