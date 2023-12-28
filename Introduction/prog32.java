import java.io.*;
class Student
{
    int rno;
    String name;
    float perc;
}
class prog32
{
    public static void main(String args[])throws IOException
    {
        Student S1=new Student();
        S1.rno=10;
        S1.name="abc";
        S1.perc=70;
        System.out.println("Rno:" +S1.rno);
        System.out.println("Name:" +S1.name);
        System.out.println("Perc:" +S1.perc);
    }
}