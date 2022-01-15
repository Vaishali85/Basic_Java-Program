import java.util.*;

class OverloadingCalculation3
{  
  void add(int a,int b)
  { 
  int c=a+b;
	  System.out.println("addition="+c);
	  }  
    void add(String a,String b)
	{
		String C=a.concat(b);
		System.out.println ("concat string="+C);
		
	}
  
  public static void main(String args[])
  {  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.add(20,20);
  obj.add("RUSHI","SOMYA");
  //now ambiguity  
  }  

}
/*
addition=40
concat string=RUSHISOMYA
*/
