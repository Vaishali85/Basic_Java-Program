
import java.util.*;
public class Student 
{
public int PRN_No,College_Code;
	
	public String Name;
	
	void acceptStud()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter PRN_Number=");
		PRN_No=sc.nextInt();
		System.out.println("Enter College Code=");
		College_Code=sc.nextInt();
		System.out.println("Enter Name of student=");
		Name=sc.next();
		
	}
	
	void disp()
	{
		
	System.out.println("PRN_number="+PRN_No);
	System.out.println("College_code="+College_Code);
	System.out.println("Name of Student="+Name);


	}
	
	
	static int SortStud(Stud_Result ob1[],int n)
	{
		
		
		int index=0;
		int max=ob1[0].Marks_Obt;
		
		for(int i=0;i<n;i++)
		{
			if(max < ob1[i].Marks_Obt) 
			{                                                                                                                                                                                   
                max = ob1[i].Marks_Obt;   
                index=i;
		}
		}
		
		return index;
		}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
System.out.println("Enter limit to accept students=");
		int n=sc.nextInt();
		student ob[]=new student[n];
		Stud_Result ob1[]=new Stud_Result[n];
		
		for(int i=0;i<n;i++)
		{
			ob[i]=new student();
			ob1[i]=new Stud_Result();
			ob[i].acceptStud();
			ob1[i].acceptResult();
		}
	
		
int ans=SortStud(ob1,n);


ob[ans].disp();
ob1[ans].disp();

		 
	}
	
	
	
}

class Stud_Result
{
	
int PRN_No,Sub_Code,Marks_Obt;


void acceptResult()
{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Subject Code=");
	Sub_Code=sc.nextInt();
	System.out.println("Enter Marks =");
    Marks_Obt=sc.nextInt();
	
}

void disp()
{
	
System.out.println("Subject Code="+Sub_Code);
System.out.println("Marks Obtain="+Marks_Obt);

}


}/*
Enter limit to accept students=
2
Enter PRN_Number=
128123
Enter College Code=
06040
Enter Name of student=
rushi
Enter Subject Code=
3454
Enter Marks =
50
Enter PRN_Number=
128122
Enter College Code=
05040
Enter Name of student=
somnath
Enter Subject Code=
54
Enter Marks =
50
PRN_number=128123
College_code=6040
Name of Student=rushi
Subject Code=3454
Marks Obtain=50
*/