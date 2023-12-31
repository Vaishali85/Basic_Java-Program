import java.io.*;
class Student
{
    int rno;
    String name;
    float perc;

    void acceptStudent()
{
    rno=10;
    name="abc";
    perc=70;
}
void printStudent()
{
    System.out.println("Rno:"+rno);
    System.out.println("Name:"+name);
    System.out.println("Percentage:"+perc);
}
}
class prog36
{
    public static void main(String args[])
    {
        Student S1=new Student();
        S1.acceptStudent();
        Student S2=new Student();
        S2.acceptStudent();
        S1.printStudent();
        S2.printStudent();
    }
}