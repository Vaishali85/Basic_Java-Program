import java.io.*;
class employee
{
    int eno;
    String name;
    int salary;
}
class prog33
{
    public static void main(String args[])throws IOException
    {
        employee e1=new employee();
        e1.eno=11;
        e1.name="XYZ";
        e1.salary=17000;
        System.out.println("Eno:"+e1.eno);
        System.out.println("Name:" +e1.name);
        System.out.println("Salary:"+e1.salary);
    }
}