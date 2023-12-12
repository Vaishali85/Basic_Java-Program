import java.io.*;
class prog14{
    public static void main(String args[])
    {
        int a=7, b=12, c;
        c= a&b;
        int d= a/b;
        int e= a<<2;
        int f= b>>2;
        System.out.println("d=" +d+ " " + "e=" +e);
        System.out.println("c=" +c+ " " + "f=" +f);
    }
}