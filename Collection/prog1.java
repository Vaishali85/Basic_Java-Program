import java.util.*;
import java.io.*;
class prog1
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(new Integer(15));
		al.add(new Integer(10));
		al.add(new Integer(5));
		al.add(new Integer(25));
		System.out.println(al);
		al.remove(new Integer(50));
		System.out.println(al);
		al.set(2,new Integer(30));
		System.out.println(al);
		System.out.println(al.get(1));
	}
}