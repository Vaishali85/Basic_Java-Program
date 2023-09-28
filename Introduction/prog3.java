import java.io.*;
class prog3
{
    public static void main(String args[])
    {
        int a,b;
        a=20;
        b=40;
        System.out.println("Before swapping a="+ a + " & " + "b=" + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping a=" + a + " & " + "b=" + b);
    } 
}