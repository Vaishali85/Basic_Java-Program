import java.io.*;
class Student
{
    int rno;
    String name;
    float perc;
    void acceptStudent(int r,String n, float f)
    {
        rno=r;
        name=n;
        perc=f;
    }
    void printStudent()
{
    System.out.println("Roll No:" +rno);
    System.out.println("Name:" +name);
    System.out.println("Percentage:" +perc);
}
}

class prog39
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.acceptStudent(1, "aaa", 70);
        s1.printStudent();
        Student s2 = new Student();
        s2.acceptStudent(2, "bbb", 72);
        s2.printStudent();
    }
}