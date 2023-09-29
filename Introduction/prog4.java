import java.io.*;
class prog4
{
    public static void main(String args[])
    {
        int a,b;
        a=10; b=20;
        System.out.println("Before swapping a=" +a+  " & " + "b=" +b);
       int c=a;
        a=b;
        a=c;
        System.out.println("After swapping a=" +a+ " & " + "b=" +b);
    }
}