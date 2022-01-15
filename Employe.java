
import java.util.*;
import java.math.*;

public class Employe
{
 int eno;
 float BasicSalary,DA,HRA,ProfessionalTax;
 String ename;
 
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the eno::");
	eno=sc.nextInt();
	System.out.println("enter the ename::");
	ename=sc.next();
	System.out.println("enter the basic salary::");
	BasicSalary=sc.nextInt();
	 Calculate();
}
 void Calculate()
{
	 
   DA=(float)12/100*BasicSalary;
   HRA=(float)25/100*BasicSalary;
   ProfessionalTax=(float)5/100*BasicSalary;
   
}
 void display()
{
  System.out.println("Eno="+eno+"\tEname="+ename+"\tBasicSalary="+BasicSalary+"\tDA="+DA+"\tHRA="+HRA+"\tProfessional Tax="+ProfessionalTax);



}
public static void main(String[] args)
{
Employe ob=new Employe();
ob.accept();
ob.display();
}
}
/*
enter the eno::
101
enter the ename::
rushi
enter the basic salary::
100
Eno=101	Ename=rushi	BasicSalary=100.0	DA=12.0	HRA=25.0	Professional Tax=5.0
/*