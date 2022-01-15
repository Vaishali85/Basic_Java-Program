import java.util.*;

class Square
{
int side ;
void area (int side )
{
int a = side*side ;
System.out.println("area of square="+a);
}

void perimeter (int side )
{
int a = 4*side ;
System.out.println("perimeter of square="+a);
}
public static void main (String args[])
{
	Square ob=new Square();
	ob.area(10);
	ob.perimeter(12);
}

}
/*
area of square=100
perimeter of square=48
*/