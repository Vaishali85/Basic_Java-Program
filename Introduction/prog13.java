import java.io.*;
class prog13{
    public static void main(String args[])
    {
        int a=10, b=5, c;
        c=a++ +b;
        System.out.println("c=" +c++);
        a+= 10;
        b-= 5;
        System.out.println("a=" +a+ " " + "b=" +b);
        
    }
}