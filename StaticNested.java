
import java.util.*;


class OuterClass
{ 
	static int x = 10;
	
	int y = 20;
	
	private static int op = 30;
	
	static class StaticNestedClass
	{
		void display()
		{
			
			System.out.println("outer_x = " + x);
			
			System.out.println("outer_private = " + op);
		}
	}
}

public class  StaticNested
{
	public static void main(String[] args)
	{
		OuterClass.StaticNestedClass ob = new OuterClass.StaticNestedClass();
		
		ob.display();
		
	}
}
/*
outer_x = 10
outer_private = 30
*/