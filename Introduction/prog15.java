import java.io.*;
class prog15{
    public static void main(String args[])
    {
        int a=7, b=12, c;
        if((a<7) & (b==12))
            System.out.println("hi");
        else
            System.out.println("Bye");
       
        a++;
        --b;
       
        if((a=8)||(b=11))
            System.out.println("Bye");
        else
            System.out.println("hi");
    }
}