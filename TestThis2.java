import java.util.*;
import java.math.*;
class Student
{  
int rollno;  
String name;  
float fee;  
Student(int rollno,String name,float fee)
{  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display()
{System.out.println(rollno+" "+name+" "+fee);
}  
}  
  
class TestThis2
{  
public static void main(String args[])
{  
Student s1=new Student(111,"ankit",5000f);  
s1.display();  

}
}  
/*
111 ankit 5000.0
*/