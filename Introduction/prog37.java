import java.io.*;
class Employee
{
    int eno;
    String name;
    double salary;
    void acceptEmployee()
{
    eno=101;
    name="xyz";
    salary=20000;
}
    void printEmployee()
    {
        System.out.println("RNO:"+eno);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
class prog37
{
    public static void main(String args[])
    {
        Employee e1=new employee();
        e1.acceptEmployee();
        Employee e2=new employee();
        e2.acceptEmployee();
        e1.printEmployee();
        e2.printEmployee();
    }
}